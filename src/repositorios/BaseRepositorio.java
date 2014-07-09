/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repositorios;

import org.hibernate.Session;
import utilidades.HibernateUtil;

/**
 *
 * @author luis
 */
public abstract class BaseRepositorio {
    protected Session sesion;
    
    public void conectar(){
        sesion=HibernateUtil.getSessionFactory().openSession();
    }
    public void desconectar(){
        sesion.close();
    }

    protected BaseRepositorio() {
        conectar();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        desconectar();
    }
    
}
