<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="template.css"/>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    </head>
    <body>
        <ul>
            <li><a href="Home.jsp">Home</a></li>    
            <li><a href="ViewItems.jsp">Available items</a></li>
            <li><a href="CreateItem.jsp">Add New Item</a></li>
            <li><a href="#">Store Locations</a></li>
            <li><a href="#">Services</a></li>
            <c:if test="${loggedin==true}">
                <li><a href="LogoutServlet">Logout</a></li>
            </c:if>
            
        </ul>
    </body>
</html>
