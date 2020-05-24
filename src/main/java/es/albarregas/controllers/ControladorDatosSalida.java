
package es.albarregas.controllers;


import es.albarregas.DAOFACTORY.DAOFactory;
import es.albarregas.beans.Avistamientos;
import es.albarregas.dao.IAvistamientosDAO;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Francisco_Antonio
 */
@WebServlet(name = "ControladorDatosSalida", urlPatterns = {"/ControladorDatosSalida"})
public class ControladorDatosSalida extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = null;
        Properties prop = new Properties();
        prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("fuenteDatos.properties"));
        String bbdd = prop.getProperty("tipoBBDD");

        if (request.getParameter("anillaboton") != null && request.getParameter("anilla").length() < 3) {

            url = "JSP/entrada.jsp";

        } else if (request.getParameter("anillaboton") != null && request.getParameter("anilla").length() == 3) {

            DAOFactory daof = DAOFactory.getDAOFactory(Integer.parseInt(bbdd));
            IAvistamientosDAO dao = daof.getAvistamientosDAO();
            ArrayList<Avistamientos> avistamiento = dao.getAvistamientos();

            request.setAttribute("avistamiento", avistamiento);
            url = "JSP/salida.jsp";

        } else {

            request.setAttribute("error", "No se han pasado parámetros");
            url = "/JSP/errores/error.jsp";

        }

        request.getRequestDispatcher(url).forward(request, response);
    }

}
