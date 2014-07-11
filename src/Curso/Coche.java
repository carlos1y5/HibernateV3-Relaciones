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
public class Coche extends Veiculo {
    private int ventanas;
    private int caballos;

    public Coche(int ventanas, int caballos, int rueda, String condutor, String color, int velocida, int posX) {
        super(rueda, condutor, color, velocida, posX);
        this.ventanas = ventanas;
        this.caballos = caballos;
      
    }
    public void mover(int tiempo){
        super.mover(tiempo);
        this.posX +=(int)(Math.random()*99);
        
    }
    public String toString(){
        return super.toString()+" y ventanas: " +ventanas+ " caballos" +caballos;
    }
    
}
