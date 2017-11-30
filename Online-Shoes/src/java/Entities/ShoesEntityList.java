/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author sujan
 */
public class ShoesEntityList {
    
    ArrayList<Shoes> shoes;  // ArrayList created for storing 
                                                 // the lists of shoes

    public ShoesEntityList() {
        shoes = new ArrayList();
    }

    public ArrayList<Shoes> getShoes() {
        return shoes;
    }
    
    // Get the existing shoes from the database and add them to the list.
    public void loadShoes(){
        Connection connection = null;
        Statement statement = null;
        ResultSet results = null;
        try{
            //Load appropriate database driver
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            
            //Connect to the database through that driver using the 
            //database url and the username and password
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/shoes", "app", "app");
            
        }
        catch(SQLException ex){
            System.out.println("Connection failed!");
        }
        catch(Exception ex){
            System.out.println("No driver!");
        }
        
        try{
            //Create and execute query statement for all in Shoes table,
            //storing links to matching records in ResultSet object results.
            statement = connection.createStatement();
            results = statement.executeQuery("select * from Shoes");
            
            //Loop to the next record in results, while there is a next record
            while(results.next()){
                
                //Get each field in current record (as appropriate type)
                String gender = results.getString("Gender");
                String brand = results.getString("Brand");
                String model = results.getString("Model");
                String color = results.getString("Color");
                String size = results.getString("Size");
                String style = results.getString("Style");
                double price = results.getDouble("Price");
                String insole = results.getString("Insole");
                String material = results.getString("Material");
                String occasion = results.getString("Occasion");
                int quantity = results.getInt("Quantity");
                
                Shoes s = new Shoes(gender, brand, model, color, size, style, price, insole, material, occasion, quantity);
                shoes.add(s);                
            }
        }
        catch(SQLException ex){
            System.out.println("Query failed!");
        }
    }
    
    //Save new course to database
    public static void addShoes(String gender, String brand, String model, String color, String size, String style, double price, String insole, String material, String occasion, int quantity)
    {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;
        try{
            //Load the appropriate database driver
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            
            //connect to the database through that driver, using the database
            //url and the username and password
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/shoes", "app", "app");
        }
        catch(SQLException ex){
            System.out.println("Connection failed!");
        }
        catch(Exception ex){
            System.out.println("No driver!");
        }
        
        try{
            
            String template = "insert into Shoes "
                    +"(Gender, Brand, Model, Color, Size, Style, Price, Insole, Material, Occasion, Quantity)"
                    + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(template);
            statement.setString(1, gender);
            statement.setString(2, brand);
            statement.setString(3, model);
            statement.setString(4, color);
            statement.setString(5, size);
            statement.setString(6, style);
            statement.setDouble(7, price);
            statement.setString(8, insole);
            statement.setString(9, material);
            statement.setString(10, occasion);
            statement.setInt(11, quantity);
            int changed = statement.executeUpdate();
            System.out.println(changed + " record added");
                        
        }catch(SQLException ex){
            System.out.println("Query failed!");
        }
        
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
