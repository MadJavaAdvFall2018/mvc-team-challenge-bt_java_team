<%@ page import="java112.project3.BT_JavaBean" %>
<%@ page import="java.util.List"%>
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
					<td>Tap Number</td>
					<td>Beer Name</td>
					<td>Beer Style</td>
					<td>Beer ABV</td>
					<td>Beer IBU</td>
					<td>Beer Color</td>
					<td>Beer Description</td>
					<td>Bottles Available</td>
				</tr>

				<c:forEach items="${requestData}" var="tappList">
				  <tr>
				    <td>${tappList.getTapNumber()}</td>
				    <td>${tappList.beerName}</td>
				    <td>${tappList.beerStyle}</td>
				    <td>${tappList.beerABV}</td>
				    <td>${tappList.beerIBU}</td>
				    <td>${tappList.beerColor}</td>
				    <td>${tappList.beerDescription}</td>
				    <td>${tappList.bottlesAvailable}</td>
				  </tr>
				</c:forEach>


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
