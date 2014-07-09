/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repositorios;


import java.util.List;
import modelo.Puesto;
import org.hibernate.Query;


/**
 *
 * @author luis
 */
public class RepositorioPuestos extends BaseRepositorio{
    
    
    public  List<Puesto> get(){
        
        
        
        Query consulta=sesion.createQuery("from Puesto");
        List<Puesto> lista=consulta.list();
        
        //sesion.close();
        return lista;
        
    }
    public Puesto get(Integer id){
        
        Puesto pues=(Puesto) sesion.get(Puesto.class, id);
        return pues;
    
    }
    
    public Puesto add(Puesto p){
         
        sesion.beginTransaction();
         sesion.save(p);
       sesion.getTransaction().commit();
       return p;
        
    }
    
    public void delete(Puesto p){
     sesion.beginTransaction();
    sesion.delete(p);
     sesion.getTransaction().commit();
     }
    public void update(Puesto p){
     sesion.beginTransaction();
        try {
            sesion.update(p);
        } catch (Exception e) {
            sesion.getTransaction().rollback();
        }
    sesion.getTransaction().commit();
    }
    
}
