<%-- 
    Document   : estudianteInfo
    Created on : 14/04/2023, 01:47:53 PM
    Author     : mateo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   
       
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name"  />
        <h1>Hola,   <jsp:getProperty name="mybean" property="name" /> !</h1>
        <jsp:setProperty name="mybean" property="fechanacimiento"  />
       <p> fecha de nacimiento: <jsp:getProperty name="mybean" property="fechanacimiento" /> </p>
        <% String saludo = mybean.saludo();%> <%=saludo%> 
       <%
    
        String edad = mybean.edad();
    %>
        Su edad es <%=edad%>
    </body>
    
</html>
