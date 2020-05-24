
package es.albarregas.DAOFACTORY;

import es.albarregas.dao.IAvistamientosDAO;

/**
 *
 * @author Francisco_Antonio
 */
public abstract class DAOFactory {
    
    public static final int MYSQL = 1;
    public static final int DERBY = 2;

    public abstract IAvistamientosDAO getAvistamientosDAO();

    public static DAOFactory getDAOFactory(int tipo) {
        DAOFactory daof = null;

        switch (tipo) {
            case MYSQL:
               // daof = new MYSQLDAOFactory();
                break;
            case DERBY:
              //  daof = new DerbyDAOFactory();
                break;
        }
        return daof;
    }
}
