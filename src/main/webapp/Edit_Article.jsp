<%@ page import="dca.mvc.gestion_produits.Models.Article" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>EDIT ARTICLE</title>
</head>
<body>
<center> <H1> GESTION DES ARTICLES</h1> </center>
<% Article art = (Article) request.getAttribute("art"); %>
<center>
  <fieldset style="...">
<legend> UPDATE ARTICLE </legend>
<form action="UpdateServlet" method="POST" >
  <table width="300px">
    <tr>
      <td>CODE </td>
      <td><input type="text" name="code" value="<%= art.getCode()%>" readonly ></td>
    </tr>
    <tr>
    <td>DESIGNATION </td>
      <td> <input type="text" name="designation" value="<%= art.getDesignation()%>"> </td>
    </tr>
    <tr>
        <td>PRIX :</td>
        <td><input type="number" name="prix" value="<%= art.getPrix()%>"></td> </tr>
    <tr>
      <td><input type="submit" value="UPDATE"></td>
      </tr>
  </table>
  </form>
  </fieldset>
<%--  <%@include file="List-Articles.jsp" %>--%>
</center>
</body>
</html>
