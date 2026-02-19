<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Page</title>
        <jsp:useBean id="product" class="seng2050.Product" scope="request" />
</head>
<body>
    <h2>Product Details</h2>
    <p>Product Name: <jsp:getProperty name="product" property="name" /></p>
    <p>Product Price: <jsp:getProperty name="product" property="price" /></p>

    <jsp:setProperty name="product" property="price" value="200" />
    <p>Product Price (after update): <jsp:getProperty name="product" property="price" /></p> 

</body>
</html>