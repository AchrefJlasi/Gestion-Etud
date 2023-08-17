<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<f:form action="save" modelAttribute="etudiant">
		<table>
			<tr>
			<td>ID :<f:hidden path="idEtudiant"/></td>
			<td>${etudiant.idEtudiant}</td>
			</tr>
			<tr>
			<td>prenom :</td>
			<td><f:input path="prenomEtudiant"/></td>
			<td><f:errors path="prenomEtudiant" cssClass="error"/></td>
			</tr>
			<tr>
			<td>nom:</td>
			<td><f:input path="nomEtudiant"/></td>
			<td><f:errors path="nomEtudiant" cssClass="error"/></td>
			</tr>
			<tr>
			<td>classe:</td>
			<td><f:input path="classeEtudiant"/></td>
			<td><f:errors path="classeEtudiant" cssClass="error"/></td>
			</tr>
			<tr>
			<td>numero:</td>
			<td><f:input path="numEtudiant"/></td>
			<td><f:errors path="numEtudiant" cssClass="error"/></td>
			</tr>
			<tr>
			<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</f:form>
	
	<table border="1" width="80%">
		<tr>
		<th>ID</th><th>Nom</th><th>Prenom</th><th>classe</th><th>numero</th>
		</tr>
	<c:forEach items="${etudiants}" var="e">
		<tr>
		<td>${e.idEtudiant }</td>
		<td>${e.nomEtudiant }</td>
		<td>${e.prenomEtudiant }</td>
		<td>${e.classeEtudiant }</td>
		<td>${e.numEtudiant }</td>
		
		<td><a href="delete?id=${e.idEtudiant }">Supprimer</a></td>
		<td><a href="edit/${e.idEtudiant }">Edit</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>
