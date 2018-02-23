<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>

<h1>${caraTest}</h1>

<form action="success" method="POST">
First Name: <input type="text" name="fName" placeholder="Jane" required> <br>
Last Name: <input type="text" name="lName" placeholder="Doe" required> <br>
Email: <input type="text" name="email" placeholder="janedoe@abc.com"> <br>
Phone Number: <input type="tel" name="phone" placeholder="(313)555-1212"> <br>
Password: <input type="password" name="pass" placeholder="1234"> <br>

<input type="radio" name="gender" value="Male" checked>Male <br>
<input type="radio" name="gender" value="Female" >Female <br>

<input type="checkbox" name="favorites" value="Decaf">Decaf <br>
<input type="checkbox" name="favorites" value="Expresso">Expresso <br>

<!-- dropdown example -->
<select name="dropDown">
	<option value="latte">Latte</option>
	<option value="cappuccino">Cappuccino</option>
	<option value="regular">Regular</option>
</select>

<input type="submit" value="Submit">

</form>
</body>
</html>