<%-- 
    Document   : index
    Created on : 28-Feb-2024, 1:38:42 pm
    Author     : yashr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Hotel Chandravali</title>
  <link rel="stylesheet" href="style.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link rel="stylesheet" href="css/style.css"/>
  <script src="js/script.js"></script>
</head>
<body>

    <%@include file="components/navbar.jsp" %>

  <div id="carouselExampleInterval" class="carousel slide  " data-bs-ride="carousel">
    <div class="carousel-inner">
      <div class="carousel-item active" data-bs-interval="10000">
          <img src="img/Reception.jpeg" class="d-block w-100 image69" alt="A picture of the Hotel Reception.">
      </div>
<!--      <div class="carousel-item" data-bs-interval="2000">
        <img src="Entrance.jpeg" class="d-block w-100" alt="A picture of the entrance of the Hotel.">
      </div>
      <div class="carousel-item">
        <img src="..." class="d-block w-100" alt="..."> 
      </div>-->
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>

</body>
</html>





