<%@page contentType="text/html" pageEncoding="UTF-8"%> <%@page import="java.util.List"%>
<%@ page import="dca.mvc.gestion_produits.Models.Article" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <title> LISTE DES ARTICLES </title>
</head> <body>
<% List<Article> MaListe = (List<Article>) request.getAttribute("MaListe"); %>
<fieldset style="width: 30px; height:520px">
    <legend>
        LISTE DES ARTICLES </legend>
    <table border="1" cellpadding="5">|
        <tr>
            <th>CODE</th>
            <th>DESIGNATION</th>
            <th>PRIX</th>
            <th colspan="2"> ACTIONS </th>
        </tr>
        <% for (Article article : MaListe) { %>
        <tr>
            <td><%=article.getCode()%></td>
            <td><%=article.getDesignation()%></td>
            <td><%=article.getPrix()%></td>
            <td> <a href="DeleteServlet?code=<%=article.getCode()%>" onclick="return confirm ('Etes vous sur de la suppression ?')" accesskey="">
                <img src="img/delete.png" width="40" height="40" /></a> </td>
            <td> <a href="EditServlet?Code=<%=article.getCode()%>" >
            <img src="img/edit.png" width="40" height="40"/> </a> </td>
        </tr>
        <% } %>
    </table>
</fieldset>
</body>
</html>
