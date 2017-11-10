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
                    
                    <h3>Details on <b>${currentshoe.brand} ${currentshoe.model}</b></h3>
                   <ul>
                       <li>This shoes is of ${currentshoe.style} style.</li>
                       <li>
                           Its price is $${currentshoe.price}
                       </li>
                       <li>
                           <c:if test="${currentshoe.insole=='padded'}">
                               It has padded insole.
                           </c:if>
                               It has removable insole.
                       </li>
                   </ul>
                       <a href ="ViewItems.jsp" >Go to <em>Available Items</em>.</a>


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
