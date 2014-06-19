/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Curso;

import static javafx.scene.paint.Color.color;

/**
 *
 * @author carlosy
 */
public class Veiculo {
    protected int rueda;
    protected String condutor;
    protected String color;    
    protected int velocida;
    protected int posX;
    private String patata;

    public Veiculo(int rueda, String condutor, String color, int velocida, int posX) {
        this.rueda = rueda;
        this.condutor = condutor;
        this.color = color;
        this.velocida = velocida;
        this.posX = posX;
        

    
        
    }
    private int movimientoRelativo(int tiempo){
          return tiempo * velocida;
          
    }
    
    public void mover (int tiempo){
        posX +=movimientoRelativo(tiempo);
    }
    public int getposX(){
        return posX;
    // ttoString nos describe la clase en cuestion.
    }
    public String toString(){
            return "El veiculo tiene "+rueda+" ruedas un color :"+color+" y es conducido por:" +condutor;
    
}
}