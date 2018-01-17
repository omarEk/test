<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Controlleur" method="Get">
<fieldset>
<legend><h1>formulaire</h1></legend>
  First name:<br>
  <input type="text" name="firstname" value="omar">
  <br>
  Last name:<br>
  <input type="text" name="lastname"><br>
  Niveau d'etudes:<br>
  <input type="radio" name="niveau d'etudes" value="bac" checked>bac<br>
  <input type="radio" name="niveau d'etudes" value="bac+2">bac+2<br>
  <input type="radio" name="niveau d'etudes" value="license">license<br>
  <input type="radio" name="niveau d'etudes" value="master">master<br>
  Age :<br>
  <input type="number" name="age" ><br><br>
  <input type="submit" name="submit">
  </fieldset>
</form>
<table border="1" cellpadding="10" >

<tr>
<th>Id</th>
<th>Nom</th>
<th>Prenom</th>
<th>Age</th>
</tr>
<c:forEach items="${list}" var="table">
<tr>
<td>${table.id}</td>
<td>${table.nom}</td>
<td>${table.prenom}</td>
<td>${table.age}</td>
<td>
<a href="<c:url value="Controlleur">
<c:param name="button" value="supprimer"/>
<c:param name="id" value="${table.id}"/></c:url>">Supprimer</a>
</td>
<td>
<a href="<c:url value="Controlleur">
<c:param name="button" value="modifier"/>
<c:param name="id" value="${table.id}"/></c:url>">Modifier</a>
</td>
</tr>

</c:forEach>
</table>
</body>
</html>