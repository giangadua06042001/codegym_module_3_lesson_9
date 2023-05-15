<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/product" method="post">
    <div class="products">
        <label><input type="text" name="productname" placeholder="productName"></label>
        <label><input type="number" name="price" placeholder="price"></label>
        <label><input type="number" name="discount" placeholder="discount"></label>
        <label><input type="submit" name="calculate" id="submit"></label>
    </div>
</form>
</body>
</html>