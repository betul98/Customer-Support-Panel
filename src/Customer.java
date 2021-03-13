/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Betül Kul
 */
public class Customer {
    private String cust_id;
    private String cust_password;

    public Customer(String cust_id, String cust_password) {
        this.cust_id = cust_id;
        this.cust_password = cust_password;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_password() {
        return cust_password;
    }

    public void setCust_password(String cust_password) {
        this.cust_password = cust_password;
    }
    
    
}
