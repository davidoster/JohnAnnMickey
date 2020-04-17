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
public class Human {
    private String name;
    
    public Human() {
        this.name = "A Human";
        System.out.println("Human's name : " + this.name);
    }
    
    public Human(String name) {
        this.name = name;
        System.out.println("Human's name : " + this.name);
    }
}
