<%-- 
    Document   : detail
    Created on : Oct 18, 2017, 8:54:41 AM
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
        <h1>Blanjaan</h1>
        Jumlah belanjaan : ${User.produk.size()}<br/>
        ${ProdukDetail.namaproduk} | ${ProdukDetail.ketPro}
        <a href="/1018Tambahkan/tambah/${ProdukDetail.id}">Tambahkan</a>
    </body>
</html>
