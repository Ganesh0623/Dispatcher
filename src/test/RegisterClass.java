package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterClass extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s1= req.getParameter("first");
		String s2= req.getParameter("last");
		String s3= req.getParameter("city");
		String s4= req.getParameter("state");
		String s5= req.getParameter("country");
		if(s1.equals(null)&&s2.equals(null))
		{
			pw.println("Field cannot be empty");
			
			
		}
		
		
		
		pw.println("Thank you, Your are Successfully Registerd.");
		pw.println("</br>");
		
		pw.println("<a href='index.html'>Please Click Here to Go Back to the Main Page</a>");
	

}
}