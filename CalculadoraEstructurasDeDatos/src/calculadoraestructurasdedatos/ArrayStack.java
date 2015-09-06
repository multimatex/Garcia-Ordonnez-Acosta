/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraestructurasdedatos;

/**
 *
 * @author Equipo
 */
public class ArrayStack<E> implements Stack<E>{

    
    private E [] data = (E[]) new Object[1];
    private int size = 0;
    @Override
    public boolean isEmpty() {
        return size == 1;
    } 

    @Override
    public E peek() {
        return data [size - 1];
    }

    @Override
    public E pop() {
        
        return null;
    }

    @Override
    public void push(E recibido) {
        
        if (data.length == size) {
            
            
            
        }
        
    }
    
}
