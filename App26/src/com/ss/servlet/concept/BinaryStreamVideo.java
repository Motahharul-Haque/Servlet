package com.ss.servlet.concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BinaryStreamVideo
 */
@WebServlet("/BinaryStreamVid")
public class BinaryStreamVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BinaryStreamVideo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("video/mp4");
		ServletOutputStream os = response.getOutputStream();
		//String path=getServletContext().getRealPath("D:\\img\\Birds.mp4");
		//File f = new File("D:\\img\\Birds.mp4"); 
		File f = new File("D:\\img\\Piya_More.mp4");
		//File f = new File("D:\\img\\Jeene_Laga_Hoon.mp4");
		//File f = new File("D:\\img\\Nainowale.mp4");
		FileInputStream fis = new FileInputStream(f);
		byte[] b = new byte[(int)f.length()];
		fis.read(b);//reading the image and placing into byte array
		os.write(b);//write byte array to the respose
		os.flush();
		os.close();
	}

	

}
