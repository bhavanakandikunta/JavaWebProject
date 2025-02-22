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
import exam.model.AdminDao;

/**
 * Servlet implementation class AdminValidation
 */
@WebServlet("/exam.controller.AdminValidation")
public class AdminValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
public AdminValidation() {
      
   }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
	response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		

		
		Admin admin = new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		
	    boolean status = AdminDao.doValidate(admin);
	    
	    if(status)
	    {
	    
	    	//Logged in  as admin do something (pending)
	    	 HttpSession session = request.getSession();
			 session.setAttribute("username", admin.getUsername());
			 response.sendRedirect("AdminPanel.jsp");
	    }
	    else
	    {
	    	String msg2 = "Invalid Username or Password";
	    	response.sendRedirect("AdminLogin.jsp?msg2="+msg2);
	    }
		
		
	}

}
