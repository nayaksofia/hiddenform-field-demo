package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HiddenFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		String userId = request.getParameter("userid");
		
		//Creating A New Hidden Form Field
		out.println("<form action='hiddenformdashboard' method='post'>");
		out.println("<input type='hidden' name='userid' id='userid' value='"+ userId +"'>" );
		out.println("<input type='submit' value='submit'>");
		out.println("</form>");
		out.println("<script> document.forms[0].submit();</script>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);//Redirecting post method to doGet method
	}

}
