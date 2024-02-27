<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
   <title>JLC BookStore</title>
   <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
   <link href="mycss/bookstore.css" rel="stylesheet">
</head>
<body>
   <div class="card">
     <c:import url="myheader.jsp"></c:import>
   </div>
   
   <h2><a href="showAllBooks">Display All Books</a></h2>
   <c:import url="myfooter.jsp"></c:import>
</body>
</html>