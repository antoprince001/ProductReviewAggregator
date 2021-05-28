<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

<title>View Product</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="/">Product Review Aggregator</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="/AddProduct">Add Product</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/ViewProduct">View Product</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/AddReview">Add Review</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/ViewReview">View Review</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<br><br><br><br>
<center>
<div class="card" style="width: 30rem;">
  <div class="card-body">
	<form action="/GetProduct" method="post" >
		
	<table>
		<tr>
		<td><br><label>Enter Product ID : </label></td>
	 	<td><br><input type="number" name="productId" ></td>
		</tr>
		
		
		<tr>
		<td></td>
		<td><br><input class="btn btn-primary" type="submit" value="Submit"></td>
		</tr>	
	 </table>
	</form>
	</div>
	</div>
</center>
</body>
</html>