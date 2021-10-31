/**
 * 
 */
package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author asus
 *
 */
public class CheckVotingElgibilityServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("pname");
		int age=Integer.parseInt(req.getParameter("page"));
		
		if(age>=18)
			pw.println("<h1>Mr/Miss/Mrs. "+name+" you r eligible for voting </h1>");
		else
			pw.println("<h1>Mr/Miss/Mrs. "+name+" you r not eligible for voting </h1>");
		
		pw.println("<a href='http://localhost:8081/Servlet-03-HtmlToServletCommunicationUsingFORM/input.html'>home</a>");
		pw.close();
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
}
