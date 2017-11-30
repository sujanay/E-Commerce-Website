/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Entities.ShoesEntityList;
import Entities.ShoesErrorList;
import Entities.ShoesValidation;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sujan
 */
public class ValidateShoesServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String nextpage ="/TemporaryStubPage.jsp";
        
        // Extract all the form inputs
        String gender = request.getParameter("gender");
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String color = request.getParameter("color");
        String size = request.getParameter("size");
        String style = request.getParameter("style");
        String strPrice = request.getParameter("price");
        String insole = request.getParameter("insole");
        String material = request.getParameter("material");
        String occasion = request.getParameter("occasion");
        String strQuantity = request.getParameter("quantity");
     
        // Create a new object for all the error messages we might need to send back
        //to the JSP
        ShoesErrorList errors = new ShoesErrorList();

        // Call each of the validaton methods, keepin track of what they return
        // so we know if anything  went wrong. Pass the ShoesErrorList to each
        // so it can be modified if an error is found by that method.
        boolean isGenderValid = ShoesValidation.validateGender(gender, errors);
        boolean isBrandValid = ShoesValidation.validateBrand(brand, errors);
        boolean isModelValid = ShoesValidation.validateModel(model, errors);
        boolean isColorValid = ShoesValidation.validateColor(color, errors);
        boolean isSizeValid = ShoesValidation.validateSize(size, errors);
        boolean isStyleValid = ShoesValidation.validateStyle(style, errors);
        boolean isPriceValid = ShoesValidation.validatePrice(strPrice, errors);
        boolean isInsoleValid = ShoesValidation.validateInsole(insole, errors);
        boolean isMaterialValid = ShoesValidation.validateMaterial(material, errors);
        boolean isOccasionValid = ShoesValidation.validateOccasion(occasion, errors);
        boolean isQuantityValid = ShoesValidation.validateQuantity(strQuantity, errors);
        
        // If no errors wer found, create the course.
        // Otherwise, redirect back to the input page.
        if(isGenderValid && isBrandValid && isModelValid && isColorValid && isSizeValid
                && isStyleValid && isPriceValid && isInsoleValid && isMaterialValid &&
                isOccasionValid && isQuantityValid)
        {
            ShoesEntityList shoes = (ShoesEntityList)session.getAttribute("shoesentitylist");
            if(shoes == null){
                shoes = new ShoesEntityList();
            }
            
            double price = Double.parseDouble(strPrice);
            int quantity = Integer.parseInt(strQuantity);
            
            //call the addShoes function of ShoesEntityList.java class and add the new
            //shoe to the database.
            ShoesEntityList.addShoes(gender, brand, model, color, size, style, price, insole, material, occasion, quantity);
            session.setAttribute("currentshoe", shoes.getShoes(brand, model));
            session.setAttribute("shoeslist", shoes);
        }
        else{
            nextpage = "/CreateItem.jsp";
            
            // Add the validation object to the session for use by the JSP
            request.setAttribute("errors", errors);
        }
        getServletContext().getRequestDispatcher(nextpage).forward(request, response); 
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
