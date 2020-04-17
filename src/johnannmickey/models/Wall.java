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
public class Wall {
    private String name;
    private Door door;
    
    public Wall() {
        this.name = "A Wall";
        System.out.println("Wall's Name : " + this.name);
    }
    
    public Wall(String name) {
        this.name = name;
        System.out.println("Wall's Name : " + this.name);
    }
    
    public Wall(String name, Door door) {
        this.name = name;
        System.out.println("Wall's Name : " + this.name);
        this.door = door;
        System.out.println("Door's Name : " + this.door.getName() + " inside wall " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
        System.out.println("Door's Name : " + this.door.getName() + " inside wall " + this.name);
    }
    
    
    
}
