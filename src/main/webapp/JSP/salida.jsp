<%-- 
    Document   : salida
    Created on : 24-may-2020, 20:43:20
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
        <form action="ControladorFinal" method="post">
            <p>Anilla: <strong><%=request.getParameter("anilla")%></strong>
            Ave: <strong><%=request.getParameter("especie")%></strong>
            Lugar: <strong><%=request.getParameter("lugar")%></strong>
            Fecha: <strong><%=request.getParameter("fecha")%></strong></p>
            <button type="submit" value="menu" name="operacion">Menú</button>
        </form>
    </body>
</html>
