package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServletInit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DemoServletInit() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.getWriter().append("Served at: ").append(req.getContextPath());
	
		PrintWriter out = resp.getWriter();
		out.println("<center><h1>Intialization Parameters</h1></center><hr>");
		Enumeration<String> e = getInitParameterNames();
		out.println("<table border=2><tr><th>Parameter Name</th><th>Parameter Value</th></tr>");
		
		while (e.hasMoreElements())
		{
			String pname = (String)e.nextElement();
			String pvalue = getInitParameter(pname);
		
			out.println("<tr><td>"+pname+"</td><td>"+pvalue+"</td></tr>");
		}
			out.println("</table>");
			out.println("</body></html>");
	}
}
