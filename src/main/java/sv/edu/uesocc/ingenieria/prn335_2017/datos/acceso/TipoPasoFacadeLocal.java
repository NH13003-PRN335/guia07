/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPaso;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoSeccion;

/**
 *
 * @author ed
 */
@Local
public interface TipoPasoFacadeLocal {

    boolean create(TipoSeccion TipoPaso);

    boolean edit(TipoSeccion  TipoSeccion);

    boolean remove(TipoSeccion TipoSeccion);

    TipoPaso find(Object id);

    List<TipoPaso> findAll();

    List<TipoPaso> findRange(int desde, int hasta);

    int count();

    public boolean create(TipoPaso registro);

    public boolean remove(TipoPaso registro);

    public boolean edit(TipoPaso registro);
    
}
