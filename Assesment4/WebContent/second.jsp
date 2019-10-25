<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>


<form action="detailServlet" method="post">
<table class=table>
<thead>
<tr>
<th>Title</th>
<th>City</th>
<th>Description</th>
</tr></thead>
<c:forEach var="z" items="${list2}">
<tr>

<td>${z.title}</td>
<td>${z.city}</td>
<td>${z.desc}</td>
</tr>
</c:forEach>

</table>
  <div class="form-row">
    <div class="form-group col-md-4">
      <label>Post Title</label><br/>
      <input type="text" class="form-control" name="title">
    </div>
    <div class="form-group col-md-4">
      <label>City/Neighbourhood</label><br>
      <input type="text" class="form-control" name="city">
    </div>
    <div class="form-group col-md-4">
      <label>Zip Code</label><br/>
      <input type="text" class="form-control" name="zip">
    </div>
  </div>
  <div class="form-group">
    <label>Description</label><br/>
    <input type="text" class="form-control" name="desc">
  </div>
  <div class="form-group">
  <label>email</label><br/>
  <input type="text" class=form-control" name="email">
  </div>
  <input type="submit" class="btn btn-primary"/>
  
</form>
</body>
</html>