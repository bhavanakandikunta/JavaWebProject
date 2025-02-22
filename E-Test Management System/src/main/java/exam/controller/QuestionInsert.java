package exam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import exam.database.Questions;
import exam.model.QuestionDao;

/**
 * Servlet implementation class QuestionInsert
 */
public class QuestionInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionInsert() {
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
		String question = request.getParameter("Question");
		String a = request.getParameter("option1");
		String b = request.getParameter("option2");
		String c = request.getParameter("option3");
		String d = request.getParameter("option4");
		String answer = request.getParameter("answer");
		
		Questions q = new Questions();
		q.setA(a);
		q.setB(b);
		q.setC(c);
		q.setD(d);
		q.setAnswer(answer);
		q.setQuestion(question);
		
		boolean status = QuestionDao.insertQuestion(q);
		
		if(status)
		{
			String msg1 = "Question Added";
	    	response.sendRedirect("/OnlineExaminationSystem/Add/AddQuestion.jsp?msg1="+msg1);
		}
		else
		{
			String msg2 = "Question not Added";
	    	response.sendRedirect("/OnlineExaminationSystem/Add/AddQuestion.jsp?msg2="+msg2);
		}
		
		
		
	
	}

}
