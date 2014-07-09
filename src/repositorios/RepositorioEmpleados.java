/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repositorios;

import java.util.Date;
import java.util.List;
import java.util.Map;
import modelo.Empleado;
import org.hibernate.Query;
import org.hibernate.Session;
import utilidades.HibernateUtil;

/**
 *
 * @author luis
 */
public class RepositorioEmpleados extends BaseRepositorio{
    
    public  List<Empleado> get(){
        
        
        Query consulta=sesion.createQuery("from Empleado");
        List<Empleado> lista=consulta.list();
        
        return lista;
        
    }
    public Empleado get(Integer id){
        
        Empleado emple=(Empleado) sesion.get(Empleado.class, id);
        
        return emple;
    
    }
    public List<Empleado> getBySalario(double salario){
        
        Query q=sesion.createQuery("from Empleado e where e.salario>"+salario);
        List<Empleado> l=q.list();
        return l;
    
    
    }
    public List<Empleado> getByFecha(Date fecha){
        
        Query q=sesion.createQuery("from Empleado e where e.fechaAlta < :fa");
        q.setDate("fa", fecha);
        List<Empleado> l=q.list();
        return l;
    
    
    }
    public List<Empleado> 
        getByConsulta(String consulta,Map<String,Object> params){
        
           Query q=sesion.getNamedQuery(consulta);
           
           for (String parametro : params.keySet()) {
            
               q.setParameter(parametro, params.get(parametro));
        }
           
           List<Empleado> lista=q.list();
           return lista;
        
        }
    public Empleado add(Empleado p){
         
       sesion.beginTransaction();
         sesion.save(p);
       sesion.getTransaction().commit();
       return p;
        
    }
    
    public void delete(Empleado p){
     sesion.beginTransaction();
    sesion.delete(p);
     sesion.getTransaction().commit();
      }
    public void update(Empleado p){
     sesion.beginTransaction();
        try {
            sesion.update(p);
        } catch (Exception e) {
            sesion.getTransaction().rollback();
        }
    sesion.getTransaction().commit();
    }
    
    
    
}
