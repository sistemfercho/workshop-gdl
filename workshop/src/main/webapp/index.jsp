<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="white">
 <div style="background-color: #00003A; width: 930px; padding: 200px;">
    <center><br>
    <div style="width: 250px; border: 4px solid #6E6E6C;">
     <div  style="background-color: #6E6E6C; color: white;"><b><center>RFC</center></b></div>
      
      <s:form action="chose"  style="padding: 20px; background-color: #DDDDD9;">
       
      <s:select label="Choose an Option" 
                list="#{'1':'CloseLoan','2':'New Loan','3':'Payment','4':'Display'}" 
                name= "options"></s:select>    
                <s:textfield name="rfc" label="RFC" />
                <s:submit value = "send" />
         
     </s:form>
   </div></center>
  </div>
 </body>
</html>

