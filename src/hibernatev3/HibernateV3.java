/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernatev3;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.Departamento;
import modelo.Empleado;
import modelo.Puesto;
import repositorios.IRepositorio;
import repositorios.Repositorio;
import repositorios.RepositorioEmpleados;
import repositorios.RepositorioPuestos;

/**
 *
 * @author luis
 */
public class HibernateV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RepositorioEmpleados re=new RepositorioEmpleados();
        //List<Empleado> empleados=re.getBySalario(70000);
         
       // List<Empleado> empleados=re.getByFecha(new Date());
        
        Map<String,Object> params=new HashMap<>();
        params.put("tuNombre", "Eva Jimenez");
        List<Empleado> empleados=re.getByConsulta("getByNombre", params);
        System.out.println("*************Todos los Empleados ******************");
        
        for (Empleado empleado : empleados) {
            System.out.println("Nombre:"+empleado.getNombre());
            System.out.println("Puesto:"+empleado.getPuesto().getNombre());
        }
        
        
        RepositorioPuestos rp=new RepositorioPuestos();
        Puesto p=rp.get(3);
        System.out.println("*************Empleados con el puesto Pringao******************");
        for (Object object : p.getEmpleados()) {
            Empleado emp=(Empleado)object;
            System.out.println(emp.getNombre());
        }
        
        
        System.out.println("Esto va con el super repositorio. Vamos a ver Dept");
        
        IRepositorio<Departamento> rd=new Repositorio<>();
        
        List<Departamento> lf=rd.get(Departamento.class);
        
        for (Departamento departamento : lf) {
            System.out.println("Nombre:"+departamento.getNombre());
        }
        
        
    }
    
}
