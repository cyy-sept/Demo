<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="/resource/css/bootstrap.min.css">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div>
	<br>
	<input type="button" value="添加" onclick="add()">
	</div>
	<br>
	<table class = "table table-bordered">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>家庭住址</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${users }" var="u" varStatus="i">
		<tr>
			<td>${i.index+1 }</td>
			<td>${u.name }</td>
			<td>${u.age }</td>
			<td>${u.home }</td>
		</tr>
		</c:forEach>
	</table>
</body>
<script type="text/javascript">

	function add(){
		location.href = "add";
	}

</script>
</html>