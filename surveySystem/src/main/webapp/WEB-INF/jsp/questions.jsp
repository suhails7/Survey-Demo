<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${ls}<br>
    <form action="addquestion" method="post">
    add questions<input type="text" placeholder="enter question"  name="qustion">
    <button type="submit" >add</button>
    </form>
        ${ls}<br>
    <form action="deletequestion" method="post">
    delete user<input type="number" placeholder="enter question id"  name="uid">
    <button type="submit" >delete</button>
    </form>
</body>
</html>