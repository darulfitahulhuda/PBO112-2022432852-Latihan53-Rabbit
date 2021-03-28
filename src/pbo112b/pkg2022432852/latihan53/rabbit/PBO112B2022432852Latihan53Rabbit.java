/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112b.pkg2022432852.latihan53.rabbit;

/**
 *
 * @author Mini Pc
 * Nama : DaruL Fitahul Huda 
 * NIM : 2022432852 
 * Kode Kelas :FS112B (PBO112B) 
 * Deksripsi Program : mendeskripsikan Rabbit dengan menggunakan OOP(inheritance,olymorphism dan constructor)
 * 
 */
public class PBO112B2022432852Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit r = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is " + r.getName());
        System.out.println(r.getName() + " is Vegetarian? " + r.vegetarian);
        System.out.println(r.getName() + " eats " + r.getEats());
        System.out.println(r.getName() + " has " + r.getNoOflegs() + " legs");
        System.out.println(r.getName() + " color is " + r.getColor());
    }
    
}
