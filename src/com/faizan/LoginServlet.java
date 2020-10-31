package com.faizan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 response.setContentType("text/html");  
		 PrintWriter out = response.getWriter();  
		          
		 String n=request.getParameter("userName");  
		 String p=request.getParameter("userPass");
		 String m=request.getParameter("userMobile");
		 String e=request.getParameter("userEmail");
		          
		    if( n.equals("Faizan") && p.equals("admin") )
		    {  
		        RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
		        rd.forward(request, response);  
		    }  
		    else
		    {  
		        out.print("Sorry UserName or Password Error!");  
		        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
		        rd.include(request, response);  
		                      
		    }  
	}

}
