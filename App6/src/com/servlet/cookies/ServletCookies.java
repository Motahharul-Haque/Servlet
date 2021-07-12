package com.servlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookies")
public class ServletCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		writer.println("Hello " + name);
		writer.println("Your password is : " + pass);
		
		Cookie c1 = new Cookie("uname", name);
		Cookie c2 = new Cookie("upass", pass);
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		writer.print("<br><a href='welcome'> view details</a>");
		writer.close();
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
