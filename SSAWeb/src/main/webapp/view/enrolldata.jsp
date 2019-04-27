<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>enroll data</title>
<link rel="shortcut icon" type="image/png"
	href="/media/images/favicon.png">
<link rel="alternate" type="application/rss+xml" title="RSS 2.0"
	href="http://www.datatables.net/rss.xml">
<link rel="stylesheet" type="text/css"
	href="/media/css/site-examples.css?_=8ffc0b31bc8d9ff82fbb94689dd1d7ff">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
<style type="text/css" class="init">
</style>
<script type="text/javascript"
	src="/media/js/site.js?_=994321fabf3873df746bb8bbccd1886a"></script>
<script type="text/javascript"
	src="/media/js/dynamic.php?comments-page=examples%2Fbasic_init%2Falt_pagination.html"
	async></script>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../resources/demo.js"></script>
<script type="text/javascript" class="init">
	
		</script>

<script type="text/javascript">
		 $(document).ready(function() {
	    			 $('#table').DataTable( {
				"pagingType": "full_numbers"
			} );
		 } );
		</script>
</head>
<body>
	<table border="1" id="table">
		<thead>
			<tr>
				<th>sNo</th>
				<th>firstName</th>
				<th>lastName</th>
				<th>state</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ssnModel}" var="ssnModel" varStatus="index">
				<tr>
					<td><c:out value="${index.count}" /></td>
					<td><c:out value="${ssnModel.firstName}" /></td>
					<td><c:out value="${ssnModel.lastName}" /></td>
					<td><c:out value="${ssnModel.state}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/">previous page</a>
</body>
</html>