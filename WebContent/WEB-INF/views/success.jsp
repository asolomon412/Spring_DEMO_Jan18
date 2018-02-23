<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!-- ******* You must add this to use the forEach loop below ***** -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>

	<h3>This came from the form: ${ helloMsg }</h3>

	<h3>The table below is coming from the JSTL forEach loop in this page</h3>
	<table>

		<c:forEach var="person" items="${pList}">
			<!-- var is a temp placeholder for the item as it iterates through the list and the items attribute is referencing the personList coming from the HomeController -->

			<tr>
				<td><c:out value="${person.firstName}"></c:out></td> <!-- I am using the person assigned by the var attribute to access the variables from the Person Object  -->
				<td><c:out value="${person.lastName}"></c:out></td>
				<td><c:out value="${person.phoneNum}"></c:out></td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>