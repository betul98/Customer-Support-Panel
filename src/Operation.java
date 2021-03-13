
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Betül Kul
 */
public class Operation {
    Connection con=null;
    Statement sta=null;
    PreparedStatement psta=null;
    
    //Database bilgileri
    String id="root";
    String password="";
    String host="localhost";
    String port="3306";
    String db_name="magexpress";
    
    public boolean Login(String id, String name, String password){
        try {
            String sorgu = "Select * from portallar where id=? and usertype=? and password=?";
            psta = con.prepareStatement(sorgu);
            psta.setString(1,id);
            psta.setString(2,name);
            psta.setString(3,password);
            ResultSet rs = psta.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
 
    
    public Operation() {
        
        String url = "jdbc:mysql://"+ host +":"+port+"/"+db_name;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,id,password);
            System.out.println("Database connection is successfull");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver calismadi ://");
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection calismadi ://");
        }
    } // databse bağlantımızı denedik ve bağlantı gerçekleşti
       
       public ArrayList<Case> caseCome(){
        ArrayList<Case> list = new ArrayList<Case>();
        String sorgu = "select * from talepler";
        try {
            sta=con.createStatement();
            ResultSet rs= sta.executeQuery(sorgu);
            while(rs.next()){
                int case_no = rs.getInt("Case_No");
                String customer_id = rs.getString("Customer_id");
                String invoice_no =rs.getString("Invoice_no");
                int damaged = rs.getInt("Damaged_products");
                String damage_info = rs.getString("Damage_info");
                String warranty_stat = rs.getString("Warranty_Status");
            list.add(new Case(case_no,customer_id,invoice_no,damaged,damage_info,warranty_stat));     
            
            }
        return list;
        
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
       }
      
    public ArrayList<Case> statusCome(){
        ArrayList<Case> check_list = new ArrayList<Case>();
       
        String user_id = GirisPanel.getId_field();
        String sorgu ="Select * from talepler where Customer_id='" +user_id+ "'" ;
        try {
            sta=con.createStatement();
            ResultSet rs= sta.executeQuery(sorgu);
            while(rs.next()){
                String customer_id = rs.getString("Customer_id");
                String invoice_no =rs.getString("Invoice_no");
                int damaged = rs.getInt("Damaged_products");
                String damage_info = rs.getString("Damage_info");
                String warranty_stat = rs.getString("Warranty_Status");
            check_list.add(new Case(customer_id,invoice_no,damaged,damage_info,warranty_stat));     
            
            }
        return check_list;
        
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
   
   public ArrayList<Customer> custCome(){
    ArrayList<Customer> cust_list = new ArrayList<Customer>();
        String kosul = "customer";
        String sorgu ="Select * from portallar where usertype='" +kosul+ "'";
        try {
            sta=con.createStatement();
            ResultSet rs= sta.executeQuery(sorgu);
            while(rs.next()){
            String customer_id = rs.getString("id");
                
               
            cust_list.add(new Customer(customer_id,null));     
            
            }
        return cust_list;
        
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
   
    public ArrayList<TechCrew> techCrewCome(){
    ArrayList<TechCrew> tech_list = new ArrayList<TechCrew>();
        String kosul = "techcrew";
        String sorgu ="Select * from portallar where usertype='" +kosul+ "'";
        try {
            sta=con.createStatement();
            ResultSet rs= sta.executeQuery(sorgu);
            while(rs.next()){
            String tech_id = rs.getString("id");
                
               
            tech_list.add(new TechCrew(tech_id,null));     
            
            }
        return tech_list;
        
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public ArrayList<Case> techCome(){
        ArrayList<Case> check_list = new ArrayList<Case>();
        String kosul = "Accepted";
        String sorgu ="Select * from talepler where Warranty_Status='" +kosul+ "'";
        try {
            sta=con.createStatement();
            ResultSet rs= sta.executeQuery(sorgu);
            while(rs.next()){
                String customer_id = rs.getString("Customer_id");
                int damaged = rs.getInt("Damaged_products");
                String damage_info = rs.getString("Damage_info");
                String warranty_stat = rs.getString("Warranty_Status");
            check_list.add(new Case(customer_id,null, damaged,damage_info,warranty_stat));     
            
            }
        return check_list;
        
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public void WarrantyUpdate(int case_no, String status, int x){
        String abc = Integer.toString(case_no);
        String sorgu = "Update talepler SET Warranty_Status=? where Case_No=?";
        try {
            if(x==1){
            status="Accepted";
            }
            else if(x==0){
            status="Denied";
            }
            psta = con.prepareStatement(sorgu);
            psta.setString(1,status);
            psta.setString(2,abc);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void caseAdd(String inv_no,String dg,String dinfo){
        String sorgu="insert into talepler(Customer_id, Invoice_no, Damaged_products, Damage_info, Warranty_Status) values (?,?,?,?,?)";
        try {
            psta=con.prepareStatement(sorgu);
             String cust_id = GirisPanel.getId_field();
            psta.setString(1,cust_id);
            psta.setString(2, inv_no);
            psta.setString(3,dg);
            psta.setString(4, dinfo);
            psta.setString(5, "On waiting");
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean custAdd(String id, String password){
        String sorgu= "insert into portallar (id, password, usertype) values (?,?,?)";
        try {
            psta=con.prepareStatement(sorgu);
            String usertype="customer";
            psta.setString(1,id);
            psta.setString(2,password);
            psta.setString(3,usertype);
            psta.executeUpdate();
            return true;
        } catch (SQLException ex) {            
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public void deleteCustomer(String cid){
        String sorgu="DELETE FROM portallar WHERE id=?";
        try {           
            psta = con.prepareStatement(sorgu);
            psta.setString(1,cid);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }
    
    public void deleteTechCrew(String tid){
    
     String sorgu="DELETE FROM portallar WHERE id=?";
        try {           
            psta = con.prepareStatement(sorgu);
            psta.setString(1,tid);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteCase(int case_no){
        String abc = Integer.toString(case_no);
        String sorgu="DELETE FROM talepler WHERE Case_No=?";
        try {           
            psta = con.prepareStatement(sorgu);
            psta.setString(1,abc);
            psta.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    public boolean techAdd(String techid, String techpassword){
        try {
            String sorgu="insert into portallar (id, password, usertype) values (?,?,?)";
            psta=con.prepareStatement(sorgu);
            String usertype="techcrew";
            psta.setString(1,techid);
            psta.setString(2,techpassword);
            psta.setString(3,usertype);
            psta.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public String getPass(String id){
        
        String sorgu ="Select * from portallar where id='"+id+"'";
        try {
            sta=con.createStatement();
            ResultSet rs= sta.executeQuery(sorgu);
            while(rs.next()){
                int user_id = rs.getInt("id");
                String pass = rs.getString("password");
                String type = rs.getString("usertype");
                return pass;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    public boolean changePass(String id,String newpass){
        try {
            String sorgu="Update portallar SET password=? where id=?";
            psta=con.prepareStatement(sorgu);
            psta.setString(1,newpass);
            psta.setString(2,id);
            psta.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
    }
    public static void main(String[] args) {
        Operation op = new Operation();
    }
}
