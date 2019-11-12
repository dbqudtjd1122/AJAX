<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("h1").click(function(){ // 인터넷창 사이즈변경
			$.ajax({
				url : "menu.json",
				success : function(xml){
					// xml 방식
					/* $(xml).find("menu").each(function(index, m){
						alert($(this).find("m_name").text());
						alert($(this).find("m_price").text());
					}); */
					
					// json방식
					var ar = xml.menu; // 배열로 받기
					$.each(ar, function(index, m){
						alert(m.m_name);
						alert(ar[index].m_price);
					});
				}
			});
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>클릭!</h1>
	<c:forEach var="m" items="${menus}">
		${m.m_name} :
		<fmt:formatNumber value="${m.m_price}" type="currency"/>
		<br>
	</c:forEach>
</body>
</html>