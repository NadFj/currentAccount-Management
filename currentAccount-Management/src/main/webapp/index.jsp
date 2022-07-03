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
<script type="text/javascript">  
function setCustomersValues(param){  
//alert("customVal:1 ");  
var accountformVal= document.getElementById("accountForm");
//alert("customVal===: "+accountformVal.customerId.value);  
//alert("param===: "+param);  

var formPost= document.getElementById("formPost");

if(param=="customerId"){
	
formPost.customerId.value=accountformVal.customerId.value ;  
}
if(param=="name"){
formPost.name.value=accountformVal.name.value ;}

if(param=="surName"){
formPost.surName.value=accountformVal.surName.value ;
}
if(param=="initialCredit"){
formPost.initialCredit.value=accountformVal.initialCredit.value ;
}
//alert("formpost param===: "+param);  

}  
</script> 
<body>
<!-- form:form modelAttribute="" -->

<FORM  id="accountForm"  action= "createAccount" method="post">
<div style="padding-top: 20" align="justify">
		<br>
		<label>Customer Id :</label>  <input  type = "number" name = "customerId" id ="customerId" onchange="setCustomersValues(name)" />

		
		<br>
		<label></label> Customer Name:  <input type = "text" name = "customerName" id = "customerName" />
		<br>
		<label> Customer Surname: </label><input type = "text" name = "surName" id = "surName" />
		
        <label> Initial Credit: </label><input type = "number" name = "initialCredit" id= "initialCredit"/>
<br>

        <INPUT TYPE="submit" value="ADD customer"  id="submit"  />
<br>
</div>
         


</FORM>
<form action="showAccounts" method="get" id="formPost">
 <input  type = "number" name = "customerId" id ="customerId" />
  <INPUT TYPE="submit" value="Display customer informations"  id="submit"  />
</form>         

      

</body>
</html>