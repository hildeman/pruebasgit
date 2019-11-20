
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
	    <link href="static/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <title>Productos</title>
    </head>
    <body>
     <script src="static/js/jquery-3.4.1.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
    
        <h1>Listado de Empresas</h1>  
        <table class="table table-striped">
            <tr>
                <th>Id</th>
                <th>Razon Social</th>
                <th>RIf</th>
                <th>Ubicacion</th>
                <th>Direccion</th>
                <th>Estatus</th>
            </tr>
            <c:forEach var="empresas" items="${empresaList}">
                       
                       
                <tr>
                    <td><b>${empresas.id_empresa}</b></td>
                    <td>${empresas.razon_social}</td>
                    <td>${empresas.rif}</td>
                    <td>${empresas.ubicacion}</td>
                    <td>${empresas.direccion}</td>
                    <td>${empresas.estatus}</td>
                    <td>
                </tr>
            
            
            </c:forEach>
        </table>
    
    
    
   
    </body>
</html>
