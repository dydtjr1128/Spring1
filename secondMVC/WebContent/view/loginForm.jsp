<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Customer ID {id001, id002, id003, id004, id005};
	<form action="doLogin" method="post">
		<table>
			<tbody>
				<tr>
					<td>User Id</td>
					<td><input type="text" name="customer_id"></td>
				</tr>
				<tr>
					<td>User Password</td>
					<td><input type="password" name="customer_password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="press"></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>