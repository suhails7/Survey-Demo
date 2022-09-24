<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>new user</h1>
<form action="addUser" method="post">
uid:<input type="number" name="uid" required="required"><br>
first name:<input type="text" name="fname" required="required"><br>
last name:<input type="text" name="lname" required="required"><br>
address:<input type="text" name="address" required="required"><br>
mobile no:<input type="number" name="mno" required="required"><br>
DOB:<input type="date" name="dob" required="required"><br>
<button name="submit" value="submit">submit</button>

</form>
</body>
</html>