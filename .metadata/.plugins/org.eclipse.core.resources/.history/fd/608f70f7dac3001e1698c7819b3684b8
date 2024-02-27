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
  
  <div class="conatiner">
  <table class="table table-striped table-bordered table-light myfont">
  
  <tr>
  <th>Book ID</th>
  <td>${MyBookInfo.bookId}</td>
  </tr>
  <tr>
  <th>Book Name</th>
  <td>${MyBookInfo.bookName}</td>
  </tr>
  <tr>
  <th>Author</th>
  <td>${MyBookInfo.author}</td>
  </tr>
  <tr>
  <th>Publications</th>
  <td>${MyBookInfo.publications}</td>
  </tr>
  <tr>
  <th>Category</th>
  <td>${MyBookInfo.category}</td>
  </tr>
  <tr>
  <th>Price</th>
  <td>${MyBookInfo.price}</td>
  </tr>
  <tr>
  <th>Offer</th>
  <td><span class="mytext-large btn-danger">${MyBookInfo.offer}% Off</span></td>
  </tr>
  <tr>
  <th>Ratings</th>
  <td>${MyBookInfo.avgRating}</td>
  </tr>
  </table>
  </div>
  <div class="container" align="center">
  <h1 class="text-center">
  <a href="continueShopping" class="btn btn-danger">Continue Shopping</a>
  </h1>
  </div>
  <br/>
   <c:import url="myfooter.jsp"></c:import>
</body>
</html>