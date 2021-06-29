package com.ss.servlet.concept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExcelServlet")
public class ExcelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcelServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter(); 
		response.setContentType("application/vnd.ms-excel");
		out.println("<h1><table border=1>");
		out.println("<tr><th>NAME</th><th>RANK</th></tr>");
		out.println("<tr><td>Motahharul Haque</td><td>1</td></tr>");
		out.println("<tr><td>Haseeb Raza</td><td>2</td></tr>");
		out.println("<tr><td>Roshan Kumar</td><td>3</td></tr>");
		out.println("<tr><td>Malik </td><td>4</td></tr></h1>"); 
		
		out.close();
	}

}
