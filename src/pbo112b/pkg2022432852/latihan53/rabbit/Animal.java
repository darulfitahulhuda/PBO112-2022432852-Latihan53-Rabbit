/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112b.pkg2022432852.latihan53.rabbit;

/**
 *
 * @author Mini Pc
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOflegs;

    public Animal(String name, boolean veg, String food, int legs, String color) {
        this.vegetarian = veg;
        this.eats = food;
        this.noOflegs = legs;

    }

    public String getEats() {
        return eats;
    }

    public int getNoOflegs() {
        return noOflegs;
    }
    
}
