/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repositorios;

import java.util.List;

/**
 *
 * @author luis
 */
public interface IRepositorio <T> {
    
    public List<T> get(Class<T> tipo);
    public T get(Class<T> tipo,int id);
    public void add(T objeto);
    public void delete(T objeto);
    public void update(T objeto);
    public void conectar();
    public void desconectar();
    
}
