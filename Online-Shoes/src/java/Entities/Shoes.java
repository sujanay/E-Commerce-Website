/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author sujan
 */
public class Shoes {
    private String gender;
    private String brand;
    private String model;
    private String color;
    private String size;
    private String style;
    private double price;
    private String insole;
    private String material;
    private String occasion;
    private int quantity;

    // default constructor
    public Shoes() {
        this.gender = "";
        this.brand = "";
        this.model = "";
        this.color = "";
        this.size = "";
        this.style = "";
        this.price = 40.0;
        this.insole = "";
        this.material = "";
        this.occasion = "";
        this.quantity = 0;
    }
    
    // parameterized constructor
    public Shoes(String gender, String brand, String model, String color, String size, String style, double price, String insole, String material, String occasion, int quantity) {
        this.gender = gender;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.style = style;
        this.price = price;
        this.insole = insole;
        this.material = material;
        this.occasion = occasion;
        this.quantity = quantity;
    }
    
    // getters and setters

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInsole() {
        return insole;
    }

    public void setInsole(String insole) {
        this.insole = insole;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
