package com.servlet.http.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome2
 */
@WebServlet("/welcome")
public class Welcome2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession(false);
		String myName = (String) session.getAttribute("uname");
		String myPass = (String) session.getAttribute("upass");
		
		writer.print("Name : " + myName + "PassWord : " + myPass);
		writer.close();
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
