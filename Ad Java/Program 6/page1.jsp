<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP include page</title>
    </head>
    <body>
        <h1>JSP include</h1>
        First name:<%=request.getParameter("Fname")%><br>
        Last name:<%=request.getParameter("Lname")%><br>
        Address:<%=request.getParameter("Address")%><br>      
    </body>
</html>
