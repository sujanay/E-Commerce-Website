<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <link rel="stylesheet" type="text/css" href="style.css" />
        <title>TODO supply a title</title>

    </head>
    <body>
        
        <div class="container">
            <div class="header">
                <c:import url="/Header.jsp"/>
            </div>
            
            <div class="main-content">
                <div class ="col-2 menu">
                    <%@include file="/Navbar.jsp" %>                   
                </div>
                <div class ="col-5 content">

                <h3>Welcome to the New Item Creation page</h3>
                You can now create New Item here. All the fields marked * is mandatory.
                </p>
                <form action="ValidateShoesServlet"> 
                
                    Gender*: </br>   
                    <input type="radio" name="gender" value="women"
                           <c:if test="${param.gender == 'women'}"> 
                               checked ="true"
                           </c:if>
                           />WOMEN 
                    <input type="radio" name="gender" value="men"
                           <c:if test="${param.gender == 'men'}"> 
                               checked ="true"
                           </c:if>                          
                           />MEN
                    <input type="radio" name="gender" value="girl"
                           <c:if test="${param.gender == 'girl'}"> 
                               checked ="true"
                           </c:if>                           
                           />GIRL
                    <input type="radio" name="gender" value="boy"
                           <c:if test="${param.gender == 'boy'}"> 
                               checked ="true"
                           </c:if>                          
                           />BOY
                        <c:if test="${errors.genderMissing}">
                            <i> Must select gender!</i>
                        </c:if>
                            <br/> 
                        Brand*:</br>
                        <td id="choice">
                            <select name="brand">
                                <option value="select brand">Select Brand</option>
                                <option value="adidas" >Adidas</option>
                                <option value="puma">Puma</option>
                                <option value="vans">Vans</option>
                                <option value="nike">Nike</option>
                                <option value="disney">Disney</option>
                                <option value="zara">Zara</option>
                                <option value="underarmour">Under Armour</option>
                                <option value="other">Other</option>
                            </select>
                                        <c:if test="${errors.brandMissing}">
                                            <i>Must select brand! </i>
                                        </c:if>
                            </br>
                       Model*:</br>
                     <input  tpye="text" name="model" value="${param.model}" />
                            <c:if test="${errors.modelMissing}">
                                <i>Must enter the model of shoes! </i>
                            </c:if>
                                <c:if test="${errors.modelIllegal}">
                                    <i>Shoes model must only contain letters and digits</i>
                                </c:if> </br>
                 
                                     
                        Color*:</br>
                            <input type="text" name="color" value="${param.color}"/>
                            <c:if test="${errors.colorMissing}">
                                <i>Must enter shoes color!</i>
                            </c:if>
                            <c:if test="${errors.colorIllegal}">
                                <i> Name of the color must only contain letters</i>
                            </c:if>
                                </br>
                        Size*:</br>
                            <select name="size">
                                <option value="select size">Select Size</option>
                                <option value="small">Small</option>
                                <option value="medium">Medium</option>
                                <option value="Large">Large</option>
                            </select>
                            <c:if test="${errors.sizeMissing}">
                                <i>Must select the size!</i>
                            </c:if>
                        </br>
                       Style*:</br>
                            <select name="style" >
                                <option value="select style">Select Style</option>
                                <option value="sneakers">Sneakers</option>
                                <option value="athletics">Athletics</option>
                                <option value="sandals">Sandals</option>          
                                <option valu="boot">Boot</option>
                                <option value="oxford">Oxford</option>
                                <option value="loafer">Loafers</option>
                                <option value="cnm">Clog & Mules</option>
                                <option value="other">Other</option>
                            </select>   </br>
                        Price*:</br>
                        <input type="text" name="price" value="${param.price}" placeholder="Enter price"/>
                        <c:if test="${errors.priceMissing}">
                            <i>Must enter the price! </i>
                        </c:if>
                        <c:if test="${errors.priceNegative}">
                            <i>Price cannot be negative! </i>
                        </c:if>
                        <c:if test="${errors.priceNotNumeric}">
                            <i> Price must only contain numbers! </i>
                        </c:if>                          
                        </br>                     
                       Insole*:</br>
                            <select name="insole">
                                <option value="select insole">Select Insole</option>
                                <option value="padded">Padded</option>
                                <option value="removable">Removable</option>
                            </select>
                            <c:if test="${errors.insoleMissing}">
                                <i>Must select insole information! </i>
                            </c:if>
                       </br>
                       
                        Material*:</br>
                            <select name="material">
                                <option value="select material">Select Material</option>
                                <option value="full leather">Fully Leather</option>
                                <option value="artificial leather">Artificial Leather</option>
                                <option value="pu">Polyurethane</option>
                                <option value="pvc">PVC/Acrylic</option>
                                <option value="other">Other</option>
                            </select> </br>
                        Occasion*:</br>
                            <select name="occasion">
                                <option value="select occasion">Select Occasion</option>
                                <option value="casual">Casual</option>
                                <option value="athletic">Athletic</option>
                                <option value="dress">Dress</option>
                                <option value="athleisure">Athleisure</option>
                                <option value="wedding">Wedding</option>
                                <option value="night out">Night Out</option>
                                <option value ="office">Office and Career</option>
                                <option value="other">Other</option>
                            </select>   </br>
                        Quantity*:</br>
                            <input type="text" name="quantity" placeholder="Enter Quantity" value="${param.quantity}">
                            <c:if test="${errors.quantityMissing}">
                                <i>Must enter the quantity!</i>
                            </c:if>
                            <c:if test="${errors.quantityNegative}">
                                <i>Shoes quantity cannot be negative!</i>
                            </c:if>
                            <c:if test="${errors.quantityNotNumeric}">
                                <i>Quantity must be whole number. Eg. 1,2,3,4,...! </i>
                            </c:if>
                            <br/>
                    <input type="submit" value="CREATE ITEM"/>
               
            </form>
                </p>

                </div>
                <div class ="col-2 right-side">
                    <%@include file="/Advertisement.html" %>
                </div>
                <div class="clear"></div>
                <div class ="footer">
                    <%@include file ="/Footer.html" %>
                    
                </div>
            </div>
          
        </div>
        
    </body>
</html>
