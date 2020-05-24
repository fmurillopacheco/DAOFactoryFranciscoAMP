
package es.albarregas.DAOFACTORY;

import es.albarregas.dao.IAvistamientosDAO;
import es.albarregas.dao.MYSQLAvistamientosDAO;

/**
 *
 * @author Francisco_Antonio
 */
public class MYSQLDAOFactory {

    MYSQLDAOFactory() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
        public IAvistamientosDAO getAvistamientosDAO() {
        return new MYSQLAvistamientosDAO();
    }
}
