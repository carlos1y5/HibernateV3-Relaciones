/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernatev3;

import java.util.List;
import modelo.Empleado;
import repositorios.RepositorioEmpleados;

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
        List<Empleado> empleados=re.get();
        
        for (Empleado empleado : empleados) {
            System.out.println("Nombre:"+empleado.getNombre());
            System.out.println("Puesto:"+empleado.getPuesto().getNombre());
        }
        
    }
    
}
