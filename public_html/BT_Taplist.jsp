<%@ page import="java112.project3.BT_JavaBean" %>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>BT_Response</title>
	<meta http-equiv="Content-Language" content="German" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" type="text/css" href="css/style.css" media="screen" />
	<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed'
		rel='stylesheet' type='text/css' />
</head>
<body>
<div id="wrap">
	<div id="header">
		<h1><a href="#">Beer Tapping App</a></h1>
	</div>

	<div id="sidebar">
		<h3 style="color:blue;">
			<button>
			<a href = "/java112">HomePage</a>
		</button>
		</h3><br/><br/>
		<h2>MVC Project #Technology</h2>
		<div class="box">
		<ul>
		<li><a href="#">Java I/O</a></li>
		<li><a href="#">Java Servlet</a></li>
		<li><a href="#">Java JSP</a></li>
		<li><a href="#">Java server Bean</a></li>
		</ul>
		</div>
	</div>

	<div id="content">
    <div id='setImageId'>
		  <img src = '/java112/images/bt.png' height ='100' width = '100'
			class="img-circle"/>
		</div>
		<div id="appContent">
			<table id = 'tableId' style = 'color: black; font-size: 1.2em'>
				<tr>
					<th>Tap Number</th>
					<th>Beer Name</th>
					<th>Beer Style</th>
					<th>Beer ABV</th>
					<th>Beer IBU</th>
					<th>Beer Color</th>
					<th>Beer Description</th>
					<th>Bottles Available</th>
				</tr>

					<c:forEach items="${requestData}" var="tapList">
						<tr>
							<td>${tapList.tapNumber}</td>
							<td>${tapList.beerName}</td>
							<td>${tapList.beerStyle}</td>
							<td>${tapList.beerABV}</td>
							<td>${tapList.beerIBU}</td>
							<td>${tapList.beerColor}</td>
							<td>${tapList.beerDescription}</td>
							<td>${tapList.bottlesAvailable}</td>
						</tr>
					</c:forEach>

				</tr>
			</table>
		</div>
	</div>

	<div id="footer">
		<div style="float: right;">
		<a href="#" title="Contact Us"><img src="/java112/images/contact.gif" alt="Contact" /></a>
		<a href="#" title="Sitemap"><img src="/java112/images/sitemap.gif" alt="Sitemap" /></a>
		<a href="#" title="Rss Feed"><img src="/java112/images/rss.png" alt="Rss Feed" /></a>
		</div>
		Theme #4 &copy; 2013 | <!-- You can use it for practically any personal or commercial use so long as you keep our footer credit links intact. -->Theme by <a target="_blank" href="http://codingdev.de" title="CodingDev">CodingDev</a>
	</div>
</div>
</body>
</html>
