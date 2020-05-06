package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=null;
		Date d=null;
		
		//Set Response typecontent
		resp.setContentType("text/html");
		//Get PrintWriter
		pw=resp.getWriter();
		//Write b logic
		d=new Date();
		pw.println("<h1 style='color:red;text-align:center;'>Date And Time::"+d+"</h1>");
		pw.println("<a href='http://localhost:8081/ServletProj_01_DateApp/welcome.html'>Home</a>");
		//close stream
		pw.close();
		
	}

}
