/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnannmickey.models;

/**
 *
 * @author mac
 */
public class Door {
    private String name;
    
    public Door() {
        this.name = "A door";
        System.out.println("Door's name : " + this.name);
    }
    
    public Door(String name) {
        this.name = name;
        System.out.println("Door's name : " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
