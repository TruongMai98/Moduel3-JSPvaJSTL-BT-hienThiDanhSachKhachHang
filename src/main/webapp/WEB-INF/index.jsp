<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        img {
            width: 50px;
            height: 50px;
        }
        th {
            width: 200px;
            text-align: left;
            border: 1px solid red;
            border-collapse: collapse;
        }

        td {
            border-bottom: double;
        }

        table {
            border: 1px solid red;
            border-collapse: collapse;
        }

        h1 {
            text-align: center;
        }
        div {
            width: 800px;
        }
    </style>
</head>
<body>

<div>
    <h1>Danh sach khach hang</h1>
    <table>
        <tr>
            <th>Ten</th>
            <th>Ngay Sinh</th>
            <th>Dia Chi</th>
            <th>Anh</th>
        </tr>
        <c:forEach items="${DBCus}" var="i">
            <tr>
                <td>${i.getName()}</td>
                <td>${i.getDateOfBirth()}</td>
                <td>${i.getAddress()}</td>
                <td>
                    <img src="${i.getImg()}"></td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>
</html>