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
public class Cat extends Animal implements IAnimal {
    
    public Cat(){
    
    }
    
    public Cat(String name) {
        
    }
   
    @Override
    public void talks() {
        System.out.println("Miaou");
    }
    
    public void talks(String talk) {
        System.out.println(talk);
    }
}
