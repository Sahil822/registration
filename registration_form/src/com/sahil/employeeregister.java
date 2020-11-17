package com.sahil;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class employeeregister extends HttpServlet {
	
	Employeedao dao=new Employeedao();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		int contact=Integer.parseInt(request.getParameter("contact"));
		
		Employee emp=new Employee();
		emp.setFirstname(firstname);
		emp.setLastname(lastname);
		emp.setUsername(username);
		emp.setPassword(password);
		emp.setContact(contact);
		
		try {
			dao.registeremployee(emp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rq=request.getRequestDispatcher("registerview.jsp");
		rq.forward(request,response);
		
	}

}
