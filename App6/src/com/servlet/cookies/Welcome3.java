package com.servlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Welcome3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		Cookie[] c = request.getCookies();
		writer.println("Name : " + c[0].getValue());
		writer.println("\nPassWord : " + c[1].getValue());
		writer.println("\nCookies Id Stored in Browser : " + c[2].getValue());
		writer.close();
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
