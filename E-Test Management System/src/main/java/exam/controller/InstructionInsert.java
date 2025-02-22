package exam.controller;

import java.io.IOException;


import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import exam.database.Instructions;
import exam.model.InstructionDao;

/**
 * Servlet implementation class InstructionInsert
 */

public class InstructionInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InstructionInsert() {
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
		
		String instruction = request.getParameter("inst");
		
		Instructions ist = new Instructions();
		ist.setInstruction(instruction);
		
		boolean status = InstructionDao.insertInstruction(ist);
		if(status)
		{
			String msg1 = "Instruction Added";
	    //	response.sendRedirect("OnlineExaminationSystem/Add/AddStudent.jsp?msg1="+msg1);
			response.sendRedirect("/OnlineExaminationSystem/AdminPanel.jsp");
		}
		else
		{
			String msg2 = "Instruction not Added";
	    	response.sendRedirect("OnlineExaminationSystem/Add/AddInstruction.jsp?msg2="+msg2);
		}

	}



}
