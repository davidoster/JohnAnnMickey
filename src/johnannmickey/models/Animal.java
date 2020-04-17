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
public class Animal implements IAnimal {
    private String name;
    
    public Animal() {
        this.name = "An Animal";
        System.out.println("Animal's name : " + this.name);
    }
    
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal's name : " + this.name);
    }
    
    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }
    
    @Override
    public void talks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void talks(String talk) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println(talk);
    }

   
    
}
