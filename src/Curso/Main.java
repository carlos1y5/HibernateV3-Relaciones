/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Curso;

/**
 *
 * @author carlosy
 */
public class Main {
    public static void main(String[] arg){
        Veiculo generico = new Veiculo (4, "Juan", "rojo", 100, 5);
        System.out.println(generico.toString());
        generico.mover(6);
        System.out.println("Posx " +generico.getposX());
        Coche coche = new Coche(4, 400, 4, "José", "azul", 100, 80);
        System.out.println(coche.toString());
        coche.mover(6);
                System.out.println(coche.getposX());
                
                
    }
    
}
