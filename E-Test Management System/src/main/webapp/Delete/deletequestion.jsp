<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="exam.database.*" %>
    <%@page import="exam.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		Questions q = new Questions();
		q.setQuestion(request.getParameter("ques"));
		int status = QuestionDao.deleteRecord(q);
		if(status > 0)
			response.sendRedirect("../List/QuestionList.jsp");
		else
			out.print("Error");
		
	%>
</body>
</html>