<%-- 
    Document   : Header
    Created on : Oct 15, 2017, 2:32:32 PM
    Author     : sujan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">    
    </head>
    <body>
            <div class="row">
                <div class="col-2 logo">             
                    <img id= "logo" src="img/pink.png" alt="Logo" height="100" width="100" align="center"/>   
                </div>
                <div class="col-5 search-bar">             
                    <div class="search bg">
                        <c:choose>
                            <c:when test="${empty searchterm}">
                                <form action="SearchServlet">
                                    <input type="text" id="searchBar" name="searchterm" placeholder="Search for Shoes..." size="25" 
                                           autocomplete="off"/><input type="submit" id="searchBtn" value="Search"/>
                                </form>                
                            </c:when>
                            <c:otherwise>
                                <c:out value="Hello ${searchterm}"/>
                            </c:otherwise>
                        </c:choose>
                    </div>     
                </div>
                <div class="col-1 signin">    
                   <a href="signIN.jsp" align="right">Sign in </a>     
                </div>
                <div class="col-1 signup">             
                   <a href="CreateAccount.jsp">Register</a>   
                </div>
	</div>
  
    </body>
</html>
