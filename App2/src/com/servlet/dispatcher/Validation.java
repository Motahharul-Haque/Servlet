package com.servlet.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		if(name.equals("Haque@32") && pass.equals("Wel@123"))
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome");
			requestDispatcher.forward(request, response);
		}
		else
		{
			writer.print("User name or password is incorrect !!");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
			requestDispatcher.include(request, response);
		}
	}

}
