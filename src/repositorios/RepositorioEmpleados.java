/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repositorios;

import java.util.List;
import modelo.Empleado;
import org.hibernate.Query;
import org.hibernate.Session;
import utilidades.HibernateUtil;

/**
 *
 * @author luis
 */
public class RepositorioEmpleados {
    
    public  List<Empleado> get(){
        
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        
        Query consulta=sesion.createQuery("from Empleado");
        List<Empleado> lista=consulta.list();
        
       // sesion.close();
        return lista;
        
    }
    public Empleado get(Integer id){
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        
        Empleado emple=(Empleado) sesion.get(Empleado.class, id);
        
        //sesion.close();
        return emple;
    
    }
    
    public Empleado add(Empleado p){
         
        Session sesion=HibernateUtil.getSessionFactory().openSession();
      sesion.beginTransaction();
         sesion.save(p);
       sesion.getTransaction().commit();
       sesion.close();
       return p;
        
    }
    
    public void delete(Empleado p){
     Session sesion=HibernateUtil.getSessionFactory().openSession();
     sesion.beginTransaction();
    sesion.delete(p);
     sesion.getTransaction().commit();
     sesion.close();
    }
    public void update(Empleado p){
     Session sesion=HibernateUtil.getSessionFactory().openSession();
     sesion.beginTransaction();
        try {
            sesion.update(p);
        } catch (Exception e) {
            sesion.getTransaction().rollback();
        }
    sesion.getTransaction().commit();
    sesion.close();
    }
    
    
    
}
