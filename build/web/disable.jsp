<%-- 
    Document   : disablecake
    Created on : Oct 31, 2021, 6:34:30 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disable Cake</title>
    </head>
    <body>
        <h1>Disable Cake</h1>
        <form action="DisableCakeController" method="POST">
            ID: <input type="text" name="txtID" value="" />
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
