/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Betül Kul
 */
public class TechCrew {
    private String tech_id;
    private String tech_pass;

    public TechCrew(String tech_id, String tech_pass) {
        this.tech_id = tech_id;
        this.tech_pass = tech_pass;
    }

    public String getTech_id() {
        return tech_id;
    }

    public String getTech_pass() {
        return tech_pass;
    }
    
}
