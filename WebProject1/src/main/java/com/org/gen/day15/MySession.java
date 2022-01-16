package com.org.gen.day15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MySession
 */
@WebServlet("/MySession")
public class MySession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name =request.getParameter("val1");
		String userid =request.getParameter("val2");
		String password =request.getParameter("val3");
		if(password.equals("123")) {
			HttpSession hs=request.getSession();
			hs.setAttribute("username", name);
			response.sendRedirect("/Session.html");
			
			
		}
	}

}
