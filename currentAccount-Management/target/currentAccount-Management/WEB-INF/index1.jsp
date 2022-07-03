<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accounts List</title>
</head>
<body>
<form:form modelAttribute="accountDto" action="createAccount" >

<div style="padding-top: 20" align="justify">
		<br>
		<label>Customer Id :</label>  <form:input path="customerId" />

		
		<br>
		<label></label> Customer Name:   <form:input path="customerName" />
		<br>
		<label> Customer Surname: </label><form:input path="customersurName"/>
		
        <label> Initial Credit: </label><form:input path="initialCredit" />

        <INPUT TYPE="submit" value="Create account"  id="submit"  />
</div>
         


         
      

</form:form>

</body>
</html>