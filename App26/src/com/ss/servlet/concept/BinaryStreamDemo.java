package com.ss.servlet.concept;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/BinaryStreamImg")
public class BinaryStreamDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public BinaryStreamDemo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("image/JPEG");
		ServletOutputStream os = response.getOutputStream();
		//String path=getServletContext().getRealPath("D:\\img\\nature.jpg");
		
		//System.out.println(path);
		File f = new File("D:\\img\\nature.jpg");
		
		FileInputStream fis = new FileInputStream(f);
		byte[] b = new byte[(int)f.length()];
		fis.read(b);//reading the image and placing into byte array
		os.write(b);//write byte array to the respose
		os.flush();
		os.close(); 
	}

}
