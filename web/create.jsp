<%-- 
    Document   : create
    Created on : Mar 4, 2022, 11:19:43 PM
    Author     : datnlm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create!</h1>
        <form action="CreateController" method="POST">
            ID: <input type="text" name="txtID"/></br>
            CookingTime: <input type="text" name="txtCookingTime"/></br>
            Name: <input type="text" name="txtName"/></br>
            Description: <input type="text" name="txtDescription"/></br>
            Quantity: <input type="text" name="txtQuantity"/></br>
            Price: <input type="text" name="txtPrice"/></br>
            <select name="cboSex">
                <option value="Male">Male</option>
                <option value="Female">Feale</option>
            </select>
            Firstname: <input type="text" name="txtFirstname"/></br>
            Lastname: <input type="text" name="txtLastname"/></br>
            <input type="submit" value="Create"/>
        </form>
    </body>
</html>
