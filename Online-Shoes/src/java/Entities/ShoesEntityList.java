/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author sujan
 */
public class ShoesEntityList {
    
    ArrayList<Shoes> shoes = new ArrayList<>();  // ArrayList created for storing 
                                                 // the lists of shoes

    public ShoesEntityList() {
        shoes.add(new Shoes("men", "Adidas","Fire","black", "small", "sneakers", 70, "padded", "fully leather", "casual", 10));
        shoes.add(new Shoes("women", "Vans","Sk8-Hi","white", "medium", "athletics", 49, "padded", "artificial leather", "dress", 12));
        shoes.add(new Shoes("men", "Puma","Heritage","brown", "small", "sandle", 90, "removable", "fully leather", "wedding", 1));
        shoes.add(new Shoes("boy", "Zara","Grafitti Plimsolls","taupe", "large", "boot", 120, "padded", "pu", "night out", 12));
        shoes.add(new Shoes("girl", "Nike","Air Force 1","gray", "medium", "loafer", 100, "removable", "pvc", "office", 21));
    }

    public ArrayList<Shoes> getShoes() {
        return shoes;
    }
    
    public void add(String gender, String brand, String model, String color, String size, String style, double price, String insole, String material, String occasion, int quantity) {
        shoes.add(new Shoes(gender, brand, model, color, size, style, price, insole, material, occasion, quantity));
    }
    
    // Search the list of current courses for one with the given
    // gender and brand, and return the corresponding object in the list.
    public Shoes getShoes(String brand, String model)
    {
        for (Shoes shoe : shoes) {
           if(brand.equals(shoe.getBrand()) && model.equals(shoe.getModel()))
           {
               return shoe;
           }
        }
        return null;
    }
        // Get the legal course prefixes as an array
    public final String[] MATERIAL = new String[]{"Fully Leather", "Artificial Leather", "Polyurethane",
                                                    "PVC/Acrylic"};
    public String[] getMaterial() {
        return MATERIAL;
    }
}
