<%-- 
    Document   : entrada
    Created on : 24-may-2020, 20:16:45
    Author     : Francisco_Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/INC/metas.inc"%>
        <link rel="stylesheet" type="text/css" href="CSS/daoFactoryStyle.css">
        <title>Avistamientos. Busqueda de Aves.</title>
    </head>
    <body>
        <form action="ControladorDatosSalida" method="post">

            <label>Introduce una anilla</label><input name="anilla" maxlength="3"/>
            <br>

            <button type="submit" name="anillaboton" value="buscar"/>Buscar
        </form>
    </body>
</html>
