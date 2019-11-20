<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
	    <link href="static/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <title>Rgistra Empresa</title>
   </head>
   <body>
     <script src="static/js/jquery-3.4.1.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
   
   
   
  <form role="form" action="crear" method="post">
  		<div class="form-group">
    		<label for="rz">Razon Social</label>
    		<input type="text" class="form-control" id="rz" placeholder="Introduce la razon social" name="razon">
  		</div>
  
		 <div class="form-group">
		    <label for="rf">Rif</label>
		    <input type="text" class="form-control" id="rf" placeholder="Introduzca el rif de su empresa" name="rif">
		  </div>
		  
		   <div class="form-group">
		    <label for="ub">Ubicacion</label>
		    <input type="text" class="form-control" id="ub" placeholder="Introduzca la ubicaciona de su empresa" name="ubicacion">
		  </div>
		  
		  <div class="form-group">
		    <label for="dr">Direcion</label>
		    <input type="text" class="form-control" id="dr" placeholder="Introduzca la direccion de su empresa" name="direccion">
		  </div>
		  
		  <input type="hidden" name="estatus" value="activa">
		  
		  
		  
  
  <button type="submit" class="btn btn-default">Enviar</button>
</form>
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   </body>
</html>         