package exam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import exam.database.Admin;
import exam.database.Students;
import exam.model.AdminDao;
import exam.model.StudentDao;

/**
 * Servlet implementation class ValidateStudent
 */
@WebServlet("/exam.controller.ValidateStudent")
public class StudentValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		

		
	    Students sd = new Students();
		sd.setUsername(username);
		sd.setPassword(password);
		
	    boolean status = StudentDao.doValidate(sd);
	    
	    
	    if(status)
	    {
	    	
	    	//Logged in  as student do something (pending)
	    	 HttpSession studentsession = request.getSession();
			 studentsession.setAttribute("username", sd.getUsername());
			 studentsession.setAttribute("name",sd.getName() );
			 response.sendRedirect("StudentInstructions.jsp");
	    	
	    }
	    else
	    {
	    	String msg = "Invalid Username or Password";
	    	response.sendRedirect("StudentLogin.jsp?msg="+msg);
	    
	}

}
}