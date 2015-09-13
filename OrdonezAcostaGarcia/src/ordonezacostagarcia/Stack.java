/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordonezacostagarcia;

/**
 *
 * @author Equipo
 */
public interface Stack<E> {

    public boolean isEmpty();

    public E peek();

    public E pop();

    public void push(E recibido);
}
