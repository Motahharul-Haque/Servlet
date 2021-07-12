package com.servlet.http.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/demo2")
public class MyServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		writer.println("Hello " + name);
		writer.println("Your password is : " + pass);
		
		HttpSession session = request.getSession();
		session.setAttribute("uname", name);
		session.setAttribute("upass", pass);
		
		writer.print("<a href='welcome'>view details</a>");
		writer.close();
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
