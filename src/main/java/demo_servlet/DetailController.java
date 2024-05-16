package demo_servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/detail")
public class DetailController extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String phone=req.getParameter("phone");
		String add=req.getParameter("add");
		
		res.getWriter().print("Name: "+name+"\n Age: "+age+"\n Phone no:"+phone+"\n Address:"+add);
		
	}

}
