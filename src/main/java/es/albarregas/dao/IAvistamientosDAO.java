/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Avistamientos;
import java.util.ArrayList;

/**
 *
 * @author Francisco_Antonio
 */
public interface IAvistamientosDAO {
    public ArrayList<Avistamientos> getAvistamientos();
    public void closeConnection();
}
