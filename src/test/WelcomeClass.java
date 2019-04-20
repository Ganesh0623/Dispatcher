package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeClass extends HttpServlet

{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String s1= req.getParameter("uname");
		String s2= req.getParameter("pwd");
		if(s2.equalsIgnoreCase("12345"))
		{
			pw.println("<h1><font size='10' color='red'> Congrats, You have Successfully Logged In</font></h1>");
			pw.println("<h2><font size='15' color='Green'>Hello </font></h2>"+s1 + " ,Sir"); 
			pw.println("<h2><font size='20' color='Green'>Happy Easter Day to You</font></h2>");
			pw.println("<h2><font size='10' color='Orange'>By Ganesh</font></h2>");
			
		}
		else
		{
			pw.println("<h1>Sorry, Wrong Password<h1/>");
			pw.println("<h1><font size='10' color='red'> Please Create your account</font></h1>");
			//pw.println("<h1>Please Create your account</h1>");
			RequestDispatcher rd= req.getRequestDispatcher("index.html");
			rd.include(req, res);
			
			
			
		}
	}
	
	

}
