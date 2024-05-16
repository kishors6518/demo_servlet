package demo_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/kishor")
public class SecondController extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("Kishor url is working");
		
		//To give the response back to client
		PrintWriter out=res.getWriter();
		out.print("Hii KIshor");
		
		
	}

}
