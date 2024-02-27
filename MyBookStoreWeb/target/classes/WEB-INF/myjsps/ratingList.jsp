<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
   <title>JLC BookStore</title>
   <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
   <link href="mycss/bookstore.css" rel="stylesheet">
</head>
<body>
   <div class="card">
     <c:import url="myheader.jsp"/>
   </div>
      
      <div class="container">
       <table class="table table-striped table-bordered table-light myfont">
       <thead class="bg-info">
       <tr>
       <th>Book ID</th>
       <th>User ID</th>
       <th>Rating</th>
       <th>Review</th>
       </tr>
       </thead>
       <c:forEach var="myuserRating" items="${MyUserRatingList}">
       <tr>
       <td>${myuserRating.bookId}</td>
       <td>${myuserRating.userId}</td>
       <td>${myuserRating.rating}</td>
       <td>${myuserRating.review}</td>
       </tr>
       </c:forEach>
       </table>
       </div>
          
   <c:import url="myfooter.jsp"/>
</body>
</html>