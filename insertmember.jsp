<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="./common/header.jsp" %>

<% 
String s= (String) request.getParameter("Ido");
//out.print("Ido is: " + s);


if (s!= null && s.equals("1"))
{
	out.print("<br> <p align=center>");
	out.print("اطلاعات به درستی در پایگاه داده ثبت شد");
	out.print("</p><br>");
}
%>




<form action="insertmembercontroller" method="post">
	<h2>Insert Members</h2>

<table style="width:30%">
  <tr>
    <td>Member Number: </td>
   <td><input type="text" name="txtmno"></td>
   
  </tr>
  <tr>
    <td>Name: </td>
   <td> <input type="text" name="txtname"></td>
  </tr>

  <tr>
    <td> Family: </td>
   <td>  <input type="text" name="txtfamily"></td>
  </tr>
  
  <tr>
    <td>Address: </td>
   <td>  	 <input type="text" name="txtaddress"></td>
  </tr>
  
  <tr>
    <td> Phone: </td>
   <td>   <input type="text" name="txtphone"></td>
  </tr>
  
  <tr>
    <td>  Age: </td>
   <td>  <input type="text" name="txtage"></td>
  </tr>
  
   <tr>
   <tr>  </tr>
   <td> </td>
   <td> <input  type="submit" value="ثبت عضو جدید"> </td>
   </tr>
</table>
	
 
	       
	
</form>



<br><br><br><br><br><br><br><br>
<%@ include file="./common/footer.jsp" %>
</body>
</html>