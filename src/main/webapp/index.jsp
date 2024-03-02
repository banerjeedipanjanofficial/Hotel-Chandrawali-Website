<%-- 
    Document   : index
    Created on : 27-Feb-2024, 8:12:36 pm
    Author     : dipan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.mycompany.website.hotelchandrawali.helper.FactoryProvider" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
        <%out.println(FactoryProvider.getFactory());%>
    </body>
</html>
