<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
	background-color: #FFF5E9;
}
h1 {
	text-align: center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>A Sample Form</h1>
	(ID : ${customer.id}  Name : ${customer.name})
	<form action="/secondMVC/doOrder" method="post">
		<table>
			<tbody>
				<tr>
					<td>Item Number:</td>
					<td><input type="text" name="itemNum" /></td>
				</tr>
				<tr>
					<td>Description:</td>
					<td><input type="text" name="description" /></td>
				</tr>
				<tr>
					<td>Price Each:</td>
					<td><input type="text" name="price" value="$" /></td>
				</tr>
			</tbody>
		</table>
		<hr />
		<table>
			<tbody>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td>Middle Initial:</td>
					<td><input type="text" name="initial" /></td>
				</tr>
				<tr>
					<td>Shipping Address:</td>
					<td><textarea name="address"></textarea></td>
				</tr>
				<tr>
					<td>Credit Card:</td>
				</tr>
				<tr>
					<td><label><input type="radio" name="cardType" value="Visa">Visa</label></td>
				</tr>
				<tr>
					<td><label><input type="radio" name="cardType"
						value="MasterCard">MasterCard</label></td>
				</tr>
				<tr>
					<td><label><input type="radio" name="cardType"
						value="American Express">American Express</label></td>
				</tr>
				<tr>
					<td><label><input type="radio" name="cardType"
						value="Discover">Discover</label></td>
				</tr>
				<tr>
					<td><label><input type="radio" name="cardType"
						value="Java SmartCard">Java SmartCard</label></td>
				</tr>
				<tr>
					<td>Credit Card Number:</td>
					<td><input type="password" name="cardNum" /></td>
				</tr>
				<tr>
					<td>Repeat Credit Card Number:</td>
					<td><input type="password"
						name="cardNumCheck" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
				</tr>
			</tbody>
		</table>
		<input type="submit" value="Submit Order" name="press" />
	</form>
	
</body>

</html>