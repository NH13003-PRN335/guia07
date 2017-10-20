/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPaso;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoSeccion;

/**
 *
 * @author ed
 */
@Stateless
public class TipoPasoFacade extends AbstractFacade<TipoPaso> implements TipoPasoFacadeLocal {

    @PersistenceContext(unitName = "sv.edu.uesocc.ingenieria.prn335_2017_prueba_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoPasoFacade() {
        super(TipoPaso.class);
    }

    @Override
    public boolean create(TipoSeccion TipoPaso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(TipoSeccion TipoSeccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(TipoSeccion TipoSeccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
