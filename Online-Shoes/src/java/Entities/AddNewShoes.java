/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.*;
/**
 *
 * @author sujan
 */
public class AddNewShoes {
    public static void main(String[] args)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet results = null;
        
        try{
            //Load the appropriate database driver
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            
            //Connect to the database through that driver, using
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
            // Define a simple insert SQL statement
            String insert = "insert into shoes " +
                    "(Gender, Brand, Model, Color, Size, Style, Price, Insole, Material, Occasion, Quantity)" +
                    "values('men', 'puma', 'tazon 6', 'blue', 'medium', 'sneakers and athletics', 20.45, 'padded', 'fabric', 'casual', 32)";
            
            // Construct a statement object from the connection
            statement = connection.createStatement();
            
            // Execute the insert statement
            statement.executeUpdate(insert);
        }
        catch(SQLException ex){
            System.out.println("Query failed");
        }
        
        
    }
}
