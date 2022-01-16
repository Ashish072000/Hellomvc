package com.org.gen.day15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyCookies
 */
@WebServlet("/MyCookies")
public class MyCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name =request.getParameter("val1");
		String userid =request.getParameter("val2");
		String pass =request.getParameter("val3");
		
		if(pass.equals("123")) {
			Cookie ck=new Cookie("userid",name);
			response.addCookie(ck);
			response.sendRedirect("MyCookiesServ2");
			
			
		}else {
			pw.print("incorrect data");
			response.sendRedirect("/cookies.html");
		}
	}

}
