<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<td>question</td>
<td>answers</td>
</tr>
	<c:forEach items="${questionlist}" var="item" varStatus="status">
    <tr>

            <td>${item.question}</td>
            <td>${counts[status.index]}</td>
 </tr>
        </c:forEach>
   
	</table>
</body>
</html>