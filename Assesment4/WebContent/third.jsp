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

<form action="next" method="post">
<div class="form-row">
    <div class="form-group col-md-4">
      <label>Name</label><br/>
      <input type="text" class="form-control" name="title">
    </div>
    <div class="form-group col-md-4">
      <label>Phn No</label><br>
      <input type="text" class="form-control" name="city">
    </div>
    <div class="form-group col-md-4">
      <label>Email</label><br/>
      <input type="text" class="form-control" name="zip">
    </div>
  </div>
  <input type="submit" class="btn btn-primary" value="Add"></button>
</form>
</body>
</html>