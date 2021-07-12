package com.servlet.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo3")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		ServletContext servletContext = getServletContext();
		
		String name = servletContext.getInitParameter("uname");
		writer.println("User Name is : " + name);
		String email = servletContext.getInitParameter("email");
		writer.println("User Email is : " + email);
		
		writer.close();
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
