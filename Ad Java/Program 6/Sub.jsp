<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Difference of two values</title>
    </head>
    <body>
        <h1>Difference of two values</h1>
        <%
           int f1=Integer.parseInt(request.getParameter("field1")) ;
            int f2=Integer.parseInt(request.getParameter("field2")) ;
            int diff=f1-f2;
            %>
            <jsp:forward page="/result.jsp">
            <jsp:param name="result" value="<%=diff%>"/>
            </jsp:forward>
    </body>
</html>
