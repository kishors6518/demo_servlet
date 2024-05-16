package demo_servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sum")
public class SumController extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op1=req.getParameter("op1");
		String op2=req.getParameter("op2");
		
		int num1=Integer.parseInt(op1);
		int num2=Integer.parseInt(op2);
		res.getWriter().print("The sum of "+num1+" & "+num2+" is "+(num1+num2));
		
		
	}

}
