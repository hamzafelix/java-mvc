﻿
<%@page contentType="text/html" pageEncoding="UTF-8"%> <%@page import="java.util.List"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <title>AJOUT ARTICLE </title>
</head>
<body>
<center> <H1> GESTION DES ARTICLES</h1> </center>
<center>
    <fieldset style="...">
        <legend> Ajouter ARTICLE  </legend>
            <form action="AddServlet" method="POST" >
                <table width="300px">
                    <tr>
                        <td>CODE </td>
                        <td><input type="text" name="code" > </td>
        </tr>
        <tr>
            <td>DESIGNATION</td>
            <td> <input type="text" name="designation"> </td>
        </tr>
        <tr>
        <td>PRIX :</td>
        <td><input type="number" name="prix"></td>
        </tr>
         </table>
            </form>
    </fieldset>
    <td><input type="submit" value="ADD"></td>
    </tr>
    <%@include file="List-Articles.jsp" %>
</center>
</body>
</html>