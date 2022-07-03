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
<!-- form:form modelAttribute="" -->

<FORM  id="accountForm" method="get" action= "createAccount">
<div style="padding-top: 20" align="justify">
		<br>
		<label>Customer Id :</label>  <input  type = "number" name = "customerId" id ="customerId" onchange="setCustomersValues(name)"/>

		
		<br>
		<label></label> Customer Name:  <input type = "text" name = "name" id = "name" onchange="setCustomersValues(name)"/>
		<br>
		<label> Customer Surname: </label><input type = "text" name = "surName" id = "surName" onchange="setCustomersValues(name)"/>
		
        <label> Initial Credit: </label><input type = "number" name = "initialCredit" id= "initialCredit" onchange="setCustomersValues(name)"/>

        <INPUT TYPE="submit" value="Display customer informations"  id="submit"  />
</div>
         


         
      

</FORM>

</body>
</html>