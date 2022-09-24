<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>all users</title>
</head>
<body>
 
    ${ls}<br>
    <form action="deleteuser" method="post">
    delete user<input type="number" placeholder="enter user id"  name="uid">
    <button type="submit" >delete</button>
    </form>
 
   
 

</body>
</html>