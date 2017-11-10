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
public class ShoesValidation {
    
    // check to see if the user has selecte the gender 
    // from the drop-down list
    public static boolean validateGender(String gender, ShoesErrorList errors)
    {
        if(gender == null || gender.equals("select gender"))
        {
            errors.setGenderMissing(true);
            return false;
        }
        else{
            return true;
        }
    }
    
    // Has the user entered the brand?
    public static boolean validateBrand(String brand, ShoesErrorList errors)
    {
        if(brand == null || brand.equals("select brand"))
        {
            errors.setBrandMissing(true);
            return false;
        }
        else{
            return true;
        }
    }
    
    // Has the user entered the Model?
    // We compare the trimmed value with the empty string.
    public static boolean validateModel(String model, ShoesErrorList errors)
    {
        if("".equals(model.trim()))
        {
            errors.setModelMissing(true);
            return false;
        }
        // we compare the string to a regular expression which specifies the value
        // must only contain digits and letters.
        String modRegEx = "\\w";
        model = model.trim();
        if(!model.matches(modRegEx))
        {
            errors.setModelIllegal(true);
            return false;
        }
        else{
            return true;
        }
    }
    
    // Has the user entered the color?
    // We compare the trimmed value with the empty string 
    public static boolean validateColor(String color, ShoesErrorList errors)
    {
        if("".equals(color.trim()))
        {
            errors.setColorMissing(true);
            return false;
        }
        // we compare the string to a regular expression which specifies
        // the value must only contain letters.
        String colRegEx = "\\w";
        color = color.trim();
        if(!color.matches(colRegEx))
        {
            errors.setColorIllegal(true);
            return false;
        }
        else{
            return true;
        }
        
    }
    
    // Has the user entered the size?
    public static boolean validateSize(String size, ShoesErrorList errors)
    {
        if(size == null || size.equals("select size"))
        {
            errors.setSizeMissing(true);
            return false;
        }
        else{
            return true;
        }
    }
    
    // Validate whether the user has entered style or not
    public static boolean validateStyle(String style, ShoesErrorList errors)
    {
        if(style == null || style.equals("select style"))
        {
            errors.setStyleMissing(true);
            return false;
        }
        else{
            return true;
        }
    }
    
    // Has the user entered NON-EMPTY, NUMERIC price?
    public static boolean validatePrice(String price, ShoesErrorList errors)
    {
        if("".equals(price.trim()))
        {
            errors.setPriceMissing(true);
            return false;
        }
        // check to ensure numeric input is entered by the user
        else{
            
            // we attempt to parse the price to double
            try{
                 double numPrice = Double.parseDouble(price);
                 
                // If the price is numeric then we check to see if it is 
                // positive (as the price of an item can't be negative)
                if(numPrice < 0){
                    errors.setPriceNegative(true);
                    return false;
                }
            }catch(NumberFormatException e){
                errors.setPriceNotNumeric(true);
                return false;
            }
     
        }
        return true;
    }
    
    // Has the user entered the Insole information?
    public static boolean validateInsole(String insole, ShoesErrorList errors)
    {
        if(insole == null || insole.equals("select insole"))
        {
            errors.setInsoleMissing(true);
            return false;
        }
        else{
            return true;
        }
    }
    
        // Has the user entered the Material information?
    public static boolean validateMaterial(String material, ShoesErrorList errors)
    {
        if(material == null || material.equals("select material"))
        {
            errors.setMaterialMissing(true);
            return false;
        }
        else{
            return true;
        }
    }
    
        // Has the user entered the Occasion information?
    public static boolean validateOccasion(String occasion, ShoesErrorList errors)
    {
        if(occasion == null || occasion.equals("select occasion"))
        {
            errors.setOccasionMissing(true);
            return false;
        }
        else{
            return true;
        }
    }
    
    // Has the user entered NON-EMPTY, INTEGER quantity?
    public static boolean validateQuantity(String quantity, ShoesErrorList errors)
    {
        if("".equals(quantity.trim()))
        {
            errors.setQuantityMissing(true);
            return false;
        }
        // check to ensure numeric input is entered by the user
        else{
            
            // we attempt to parse the price to int
            try{
                 int numQuantity = Integer.parseInt(quantity);
                 
                // If the price is numeric then we check to see if it is 
                // positive (as the Quantity of an item can't be negative)
                if(numQuantity < 0){
                    errors.setQuantityNegative(true);
                    return false;
                }
            }catch(NumberFormatException e){
                errors.setQuantityNotNumeric(true);
                return false;
            }
     
        }
        return true;
    }
    
    
    
}
