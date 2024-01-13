<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
        // Retrieve the session object
        HttpSession currentSession = request.getSession(false);

        // Check if the session is not null and the username attribute is set
        if (currentSession !=null) {
            // Get the username from the session
            currentSession.invalidate();                                                       
        } 
            // Redirect to the login page if the session is not valid
            response.sendRedirect("index.html");
        
    %>

</body>
</html>