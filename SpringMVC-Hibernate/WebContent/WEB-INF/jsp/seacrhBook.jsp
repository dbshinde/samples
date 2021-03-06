<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Spring 3 MVC Hibernate - Book CRUD</title>
	<style type="text/css">
		body {
			font-family: verdana;
			font-size: 12px;
			margin: 40px;
		}
		.bookTable, .bookTable td {
			border-collapse: collapse;
			border: 1px solid #aaa;
			margin: 2px;
			padding: 2px 2px 2px 10px;
			font-size: 12px;
		}
		.bookTable th {
			font-weight: bold;
			font-size: 12px;
			background-color: #5C82FF;
			color: white;
		}
		.bookLabel {
			font-family: verdana;
			font-size: 12px;
			font-weight: bold;
		}
		a, a:AFTER {
			color: blue;
		}
	</style>
	<script type="text/javascript">
	function deleteBook(bookId){
		if(confirm('Do you want to delete this Book ?')){
			var url = 'delete/'+bookId;
			window.location.href = url;
		}
	}
	</script>
</head>
<body>

<h2>Book Store - SpringMVC-Hibernate CRUD Application</h2>
<p style="color:green;font-weight:bold;">To add a New Book please click <a href="<c:url value='/index' />" >
	Here
</a>
</p>
<c:url var="action" value="/seacrhBook" ></c:url>
<form:form action="${action}" commandName="book" cssClass="bookForm">
	<table>
	<tr>
		<td>
			<form:label path="author" cssClass="bookLabel">
				<spring:message code="label.search" />
			</form:label>
		</td>
		<td>
			<form:input path="author" />
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="submit" value="Search book"/>
		</td>
	</tr>
</table>	
</form:form>
<h3>List of Books in Library</h3>

<c:if test="${!empty bookList}">
	<table class="bookTable">
	<tr>
		<th width="180">Book Name</th>
		<th width="160">Author Name</th>
		<th width="60">Price</th>
		<th width="80">Quantity</th>
		<th width="60">Action</th>
	</tr>
	<c:forEach items="${bookList}" var="book">
		<tr>
			<td align="center"><a href="<c:url value='/edit/${book.id}' />" >${book.bookName}</a></td>
			<td align="center">${book.author}</td>
			<td align="center">${book.price}</td>
			<td align="center">${book.quantity}</td>
			<td>
				<a href="#" onclick="javascript:deleteBook(${book.id})" style="text-align:left">Delete</a>|<a href="<c:url value='/edit/${book.id}' />" style="text-align:right">Edit</a>
			</td>
		</tr>
	</c:forEach>
	</table>
</c:if>


</body>
</html>
