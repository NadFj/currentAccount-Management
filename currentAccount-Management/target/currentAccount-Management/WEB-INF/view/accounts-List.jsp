<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accounts List</title>
</head>
<body>
<div>
</div>
	<div>
	<H1>Customer accounts list</H1>
		<table border="2">
			<thead>
				<tr>
					<td>Account Id</td>
					<td>Customer Id</td>
					<td>Customer Name</td>
					<td>Customer SurName</td>
					<td>Account Type</td>
				</tr>
			</thead>

			<c:forEach items="${lstAccount}" var="account">
				<tr>
					<td>${account.accountId}</td>
					<td>${account.customerId}</td>
					<td>${account.customerName}</td>
					<td>${account.customerSurName}</td>
					<td>${account.initialCredit}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>