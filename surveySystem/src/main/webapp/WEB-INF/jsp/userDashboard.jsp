q<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user dashboard</title>
</head>
<body>
<form action="countanswer" method="post">
uid:<input type="text" id="country" name="uid" value="${uid}" readonly><br><br>
<table border="1">
<tr>
<td>Question </td>
<td>choose</td>
</tr>
<c:forEach var="window" items="${question}">
		<tr><td>${window.question}		</td>
		<td>	 yes:<input type="radio" id="html" name="<c:out value="${window.question}"/>" value="yes">  no:<input type="radio" id="html" name="<c:out value="${window.question}"/>" value="no">  
		
		</td></tr>
	
		
	</c:forEach>
	
	</table>
	<button type ="submit">submit</button>
</form>
<h1></h1>
</body>
</html>