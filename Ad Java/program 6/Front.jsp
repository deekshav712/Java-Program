<%-- 
    Document   : Front
    Created on : 27 Dec, 2022, 2:43:57 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page for get form values</title>
    </head>
    <body>
        <h1>welcome to vivekananda college of Engineering and Technology</h1>
        <% String s1=request.getParameter("field1");
           String s2=request.getParameter("field2");
           Integer.parseInt(s1);
           Integer.parseInt(s1);
           String submit=request.getParameter("submit");
           if(submit.equals("add"))
           {
               %>
               <jsp:forward page="/Add.jsp"/>
               <%
           }
           else if(submit.equals("sub")){
               %>
               <jsp:forward page="/Sub.jsp"/>
               <%
                   }
                  else {
                        %>
                        <jsp:forward page="/home.html"/>
                        <%
                           }
                           %>
    </body>
</html>
