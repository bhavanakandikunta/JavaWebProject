<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@page import="exam.model.StudentDao"%>
<%@page import="exam.database.Students"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	
<title>Update Student Now</title>
</head>
<body>
<%
		String newuserid = request.getParameter("username");
        String newpassword = request.getParameter("password");
        String newname = request.getParameter("name");
        String originaluid = request.getParameter("usernameoriginal");
		int status = StudentDao.doUpdateNowRecord(originaluid,newuserid,newpassword,newname);
		if(status > 0)
		{ 
			response.sendRedirect("../List/StudentList.jsp");
		}
		else if(status == -1)
		{
			
			out.print("error from databse");
			
		}
		else
		{
			out.print("exception occured");
		}
		
	%>
</body>
</html>