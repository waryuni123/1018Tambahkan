<%-- 
    Document   : welcome
    Created on : Oct 18, 2017, 8:41:43 AM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Selamat Datang ${User.userName}</h1>
        Jumlah belanjaan : ${User.produk.size()}<br/>
        <c:forEach var="p" items="${pd}">
            ${p.namaproduk}${p.harga}
            <a href="detail/${p.id}">COBA</a><br/>
            
        </c:forEach>
    </body>
</html>
