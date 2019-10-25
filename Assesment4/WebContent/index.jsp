<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ad Listing</title>
</head>
<body>
<h1>Choose Ad Category</h1>
<form action="CheckServlet" method="post">
<input type="radio" name="ad" value="job">Job Offered</input><br/>
<input type="radio" name="ad" value="gig">Gig Offered</input><br/>
<input type="radio" name="ad" value="resume">Resume/Job Wanted</input><br/>
<br/>
<input type="radio" name="ad" value="housing">Housing Offered</input><br/>
<input type="radio" name="ad" value="wanted">Housing Wanted</input><br/>
<br/>
<input type="radio" name="ad" value="sale">For Sale By Owner</input><br/>
<input type="radio" name="ad" value="saleDealer">For Sale By Dealer</input><br/>
<input type="radio" name="ad" value="wantedOwner">Wanted By Owner</input><br/>
<input type="radio" name="ad" value="WantedDealer">Wanted By dealer</input><br/>
<br/>
<input type="radio" name="ad" value="Service">Service Offered</input><br/>
<br/>
<input type="radio" name="ad" value="community">Community</input><br/>
<input type="radio" name="ad" value="event">Event/Class</input><br/>
<input type="submit" value="Submit"/>
</form>
</body>
</html>