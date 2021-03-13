/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Betül Kul
 */
public class Case {
    private int case_no;
    private String customer_id;
    private String invoice_no;
    private int damaged;
    private String damage_info;
    private String warranty_stat;

    public Case(int case_no,String customer_id, String invoice_no, int damaged, String damage_info, String warranty_stat){
        this.case_no=case_no;
        this.customer_id=customer_id;
        this.damage_info=damage_info;
        this.damaged=damaged;
        this.invoice_no=invoice_no;
        this.warranty_stat=warranty_stat;
    }
    
    public Case(String customer_id, String invoice_no, int damaged, String damage_info, String warranty_stat){
        this.customer_id=customer_id;
        this.damage_info=damage_info;
        this.damaged=damaged;
        this.invoice_no=invoice_no;
        this.warranty_stat=warranty_stat;
    }


    public int getCase_no(){
        return case_no;
    }
    
    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public int getDamaged() {
        return damaged;
    }

    public void setDamaged(int damaged) {
        this.damaged = damaged;
    }

    public String getDamage_info() {
        return damage_info;
    }

    public void setDamage_info(String damage_info) {
        this.damage_info = damage_info;
    }

    public String getWarranty_stat() {
        return warranty_stat;
    }

    public void setWarranty_stat(String warranty_stat) {
        this.warranty_stat = warranty_stat;
    }
    
}
