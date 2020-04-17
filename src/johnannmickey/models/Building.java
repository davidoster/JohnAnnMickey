/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnannmickey.models;

import java.util.List;

/**
 *
 * @author mac
 */
public abstract class Building {
    private String name;
    private List<Wall> walls;
    
    public abstract void setName(String name);
    public abstract String getName();
    
    public abstract void setWalls(List<Wall> walls);
    public abstract List<Wall> getWalls();
    
}
