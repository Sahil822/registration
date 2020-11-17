package com.sahil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class Employeedao {
	
	
	public int registeremployee(Employee employee) throws ClassNotFoundException
	{
	  
		
	    String sql="INSERT INTO registration_fields(id,first name,last name,username,password,contact) VALUES(?,?,?,?,?,?);";
	    
	    
	    
	    int result=0;
	    Class.forName("com.mysql.cj.jdbc.Driver");
//	    SSL=false
	    Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3308/registration?useTimezone=true&serverTimezone=UTC","root","1234");
			 PreparedStatement st=con.prepareStatement(sql);
			    
			    st.setInt(1, 1);
			    st.setString(2, employee.getFirstname());
			    st.setString(3, employee.getLastname());
			    st.setString(4, employee.getUsername());
			    st.setString(5, employee.getPassword());
			    st.setInt(6, employee.getContact());
			    
			  result =st.executeUpdate();
			  st.close();
			  System.out.println("jvhvhjadv");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return result;	
	}

}
