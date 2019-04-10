<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>BT_Home</title>
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
			<div id="homeDivAlignContent">
				<table id="setNoBorder">
					<tr>
						<th>
							<button id="goBtn">
							<a href="<%=request.getContextPath()%>/beer-tap?">
							GO TO BT_APP</a>
						 </button>
					 </th>
						<th>
							<button id="goBtn">
			 			   <a href="bt_MVC_Architecture.html">
			 			   Display BT_App Architecture</a>
			 		  </button>
					</th>
					</tr>
				</table>
			</div>
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
