<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style type="text/css">
        .elevator{
            height:180px; width:230px;
            margin:0;
            padding:10px;
            border:1px #CCC solid;
        }
        .elevator input{
            padding:5px; margin:5px
        }
        #submit{
            color: darkgray;
        }
    </style>
</head>
<body>
<%--<form action="/product" method="post">--%>
<%--    <div class="products">--%>
<%--        <label><input type="text" name="productname" placeholder="productName"></label>--%>
<%--        <label><input type="number" name="price" placeholder="price"></label>--%>
<%--        <label><input type="number" name="discount" placeholder="discount"></label>--%>
<%--        <label><input type="submit" name="calculate" id="submit"></label>--%>
<%--    </div>--%>
<%--</form>--%>
<form action="/LoginServlet" method="post">
    <div class="elevator">
        <label><input type="text" name="username" placeholder="UserName"></label>
        <label><input type="password" name="password" placeholder="password"></label>
        <label><input id="submit" type="submit" name="submit"></label>
    </div>

</form>
</body>
</html>