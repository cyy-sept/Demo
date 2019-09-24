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
		<form>
		<table class = "table table-bordered">
			<tr align="center">
				<td>
					名字:<input type="text" name="name">
				</td>
			</tr>
			<tr align="center">
				<td>
					年龄:<input type="text" name="age">
				</td>
			</tr>
			<tr align="center">
				<td>
					家庭住址:<input type="text" name="home">
				</td>
			</tr>
			<input type="button" value="添加" onclick="add()">
		</form>
</body>
<script type="text/javascript">
	function add(){
		$.post(
			"add",
			 $("form").serialize(),
			function(flag){
				if(flag>0){
					alert("添加成功")
					location = "selects";
				}else{
					alert("添加失败")
				}
			},
			"json"
			
		)
	}
</script>
</html>