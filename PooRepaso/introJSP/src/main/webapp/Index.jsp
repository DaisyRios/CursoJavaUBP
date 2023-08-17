<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Agregar usuario</h1>
<form action = "SvUsuario" method = "POST"> 

<label> Dni: <input type "text" name="dni"> </label>
<label> Nombre: <input type "text" name="nombre"> </label>
<label> Apellido: <input type "text" name="apellido"></label>

<button type="submit"> Enviar </button>

</form>
<br>
<br>
<form action= "SvUsuario" method= "GET">
 <h1> Hacer click para ver los usuarios</h1>
  <button type = "submit"> Mostrar Usuarios</button>

</form>

</body>
</html>