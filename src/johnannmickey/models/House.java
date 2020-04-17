/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnannmickey.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class House extends Building {
    private String name;
    private List<Wall> walls;
    Human human;
    Animal animal;
    
    // public
    // protected
    // default (empty access modifier) DO NOT USE
    // private
        
    public House() {
        setName("");
        this.name = "Nobody's house!!!";
        System.out.println("House's Name: " + this.name);
    }
    
    public House(String name){
        this.name = name;
        System.out.println("House's Name: " + this.name);
        walls = new ArrayList<Wall>();
                
        walls.add(new Wall("Wall 1"));
        walls.get(0).setDoor(new Door("Door 1"));
        
        walls.add(new Wall("Wall 2"));
        walls.add(new Wall("Wall 3"));
        walls.add(new Wall("Wall 4"));
        Human john = new Human("John");
        Animal ann = new Cat("Ann");
        ann.talks(); // overriden method
        ann.talks("This is your cat that speaks human lang and my name is " + ann.getName());
        Mouse m = new Mouse();
        m.talks();
        
        
    } 
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
//        super.setName(name);
//        setName(name);
    }
    
    
    public void setWalls(List<Wall> walls){
    
    }
    
    public List<Wall> getWalls(){
        return null;
    }
    
}

