package exam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import exam.database.Students;
import exam.model.StudentDao;

/**
 * Servlet implementation class StudentInsert
 */
public class StudentInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		Students st = new Students();
		st.setName(name);
		st.setPassword(password);
		st.setUsername(username);
		
		boolean status = StudentDao.insertStudent(st);
		if(status)
		{
			String msg1 = "Student Added";
	    //	response.sendRedirect("OnlineExaminationSystem/Add/AddStudent.jsp?msg1="+msg1);
			response.sendRedirect("/OnlineExaminationSystem/AdminPanel.jsp");
		}
		else
		{
			String msg2 = "Student not Added";
	    	response.sendRedirect("../AddStudent.jsp?msg2="+msg2);
		}
		
	}

}
