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
public class Rabbit extends Animal {
     private final String color, name;


    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(name, veg, food, legs, color);
        this.color = color;
        this.name = name;

    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
