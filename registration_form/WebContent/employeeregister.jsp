<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
.b2{
background-color:red;
text-align:center;
}
</style>
<body>
  
  <div class="b2">
  
  <h1><b>Registration Form</b></h1>
      
   <form  action="register" method="post">
     
       <tr>
      <td>First name</td>
      <td><input type="text" name="firstname"/></td>
      </tr><br>
      
       <tr>
      <td>Last name</td>
      <td><input type="text" name="lastname"/></td>
      </tr><br>
      
       <tr>
      <td>Username</td>
      <td><input type="text" name="username"/></td>
      </tr><br>
      
       <tr>
      <td>Password</td>
      <td><input type="password" name="password"/></td>
      </tr><br>
      
       <tr>
      <td>Contact</td>
      <td><input type="number" name="contact"/></td>
      </tr><br>
      
      <input type="submit">
   
   </form  >
  
  </div>

</body>
</html>