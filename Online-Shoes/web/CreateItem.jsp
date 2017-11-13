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
        <title align=>Add New Item</title>

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
                                <option value="adidas"
                                        <c:if test="${param.brand=='adidas'}">selected="true"</c:if>
                                        >Adidas</option>
                                <option value="puma"
                                        <c:if test="${param.brand=='puma'}">selected="true"</c:if>
                                        >Puma</option>
                                <option value="vans"
                                        <c:if test="${param.brand=='vans'}">selected="true"</c:if>
                                        >Vans</option>
                                <option value="nike"
                                        <c:if test="${param.brand=='nike'}">selected="true"</c:if>
                                        >Nike</option>
                                <option value="disney"
                                        <c:if test="${param.brand=='disney'}">selected="true"</c:if>
                                        >Disney</option>
                                <option value="zara"
                                        <c:if test="${param.brand=='zara'}">selected="true"</c:if>
                                        >Zara</option>
                                <option value="under armour"
                                        <c:if test="${param.brand=='under armour'}">selected="true"</c:if>
                                        >Under Armour</option>
                                <option value="other"
                                        <c:if test="${param.brand=='other'}">selected="true"</c:if>
                                        >Other</option>
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
                                <option value="small"
                                        <c:if test="${param.size=='small'}">selected = "true"</c:if>
                                        >Small</option>
                                <option value="medium"
                                        <c:if test="${param.size=='medium'}">selected = "true"</c:if>
                                        >Medium</option>
                                <option value="large"
                                        <c:if test="${param.size=='large'}">selected = "true"</c:if>
                                        >Large</option>
                            </select>
                            <c:if test="${errors.sizeMissing}">
                                <i>Must select the size!</i>
                            </c:if>
                        </br>
                       Style*:</br>
                            <select name="style" >
                                <option value="select style">Select Style</option>
                                <option value="sneakers"
                                        <c:if test="${param.style=='sneakers'}">selected = "true"</c:if>
                                        >Sneakers</option>
                                <option value="athletics"
                                        <c:if test="${param.style=='athletics'}">selected = "true"</c:if>
                                        >Athletics</option>
                                <option value="sandals"
                                        <c:if test="${param.style=='sandals'}">selected = "true"</c:if>
                                        >Sandals</option>          
                                <option valu="boot"
                                        <c:if test="${param.style=='boot'}">selected = "true"</c:if>
                                        >Boot</option>
                                <option value="oxford"
                                        <c:if test="${param.style=='oxford'}">selected = "true"</c:if>
                                        >Oxford</option>
                                <option value="loafer"
                                        <c:if test="${param.style=='loafer'}">selected = "true"</c:if>
                                        >Loafers</option>
                                <option value="cnm"
                                        <c:if test="${param.style=='cnm'}">selected = "true"</c:if>
                                        >Clog & Mules</option>
                                <option value="other"
                                        <c:if test="${param.style=='cnm'}">selected = "true"</c:if>
                                        >Other</option>
                            </select> 
                            <c:if test="${errors.styleMissing}">
                                <i>Must select style! </i>
                            </c:if>
                       </br>
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
                                <option value="padded"
                                        <c:if test="${param.insole == 'padded'}">
                                            selected="true"
                                        </c:if>
                                        >Padded</option>
                                <option value="removable"
                                        <c:if test="${param.insole == 'removable'}">
                                            selected="true"
                                        </c:if>                                       
                                        >Removable</option>
                            </select>
                            <c:if test="${errors.insoleMissing}">
                                <i>Must select insole information! </i>
                            </c:if>
                       </br>
                       
                        Material*:</br>
                            <select name="material">
                                <option value="select material">Select Material</option>
                                <c:forEach var="material" items="${shoesentitylist.material}">
                                    <option value="${material}"
                                            <c:if test="${param.material == material}">
                                                selected="true"
                                            </c:if>
                                                >
                                    ${material}
                                    </option>
                                </c:forEach>
                            </select> 
                            <c:if test="${errors.materialMissing}">
                                <i>Must select material!</i>
                            </c:if>
                        </br>
                        Occasion*:</br>
                            <select name="occasion">
                                <option value="select occasion">Select Occasion</option>
                                <option value="casual"
                                        <c:if test="${param.occasion=='casual'}">selected="true"</c:if>
                                        >Casual</option>
                                <option value="athletic"
                                        <c:if test="${param.occasion=='athletic'}">selected="true"</c:if>
                                        >Athletic</option>
                                <option value="dress"
                                        <c:if test="${param.occasion=='dress'}">selected="true"</c:if>
                                        >Dress</option>
                                <option value="athleisure"
                                        <c:if test="${param.occasion=='athleisure'}">selected="true"</c:if>
                                        >Athleisure</option>
                                <option value="wedding"
                                        <c:if test="${param.occasion=='wedding'}">selected="true"</c:if>
                                        >Wedding</option>
                                <option value="night out"
                                        <c:if test="${param.occasion=='night out'}">selected="true"</c:if>
                                        >Night Out</option>
                                <option value ="office"
                                        <c:if test="${param.occasion=='office'}">selected="true"</c:if>
                                        >Office and Career</option>
                                <option value="other"
                                        <c:if test="${param.occasion=='other'}">selected="true"</c:if>
                                        >Other</option>
                            </select>   
                            <c:if test="${errors.occasionMissing}">
                                <i>Must select occasion!</i>
                            </c:if>
                        </br>
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
