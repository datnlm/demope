<%-- 
    Document   : search
    Created on : Mar 4, 2022, 11:43:25 PM
    Author     : datnlm
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Search</h1>
        <form action="SearchController" method="POST">
            fromCookingTime: <input type="text" name="txtFromCookingTime"/></br>
            toCookingTime: <input type="text" name="txtToCookingTime"/></br> 
            <input type="submit" value="Search"/>
        </form>
        <c:if test="${requestScope.LIST_CAKE != null}">
            <table border="1">
                <thead>
                    <tr>
                        <th>Number</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>CookingTime</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dto" items="${requestScope.LIST_CAKE}" varStatus="counter">
                        <tr>
                            <td>${counter.count}</td>
                            <td>${dto.name}</td>
                            <td>${dto.price}</td>
                            <td>${dto.firstname}</td>
                            <td>${dto.lastname}</td>
                            <td>${dto.cookingTime}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </c:if>
    </body>
</html>
