/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordonezacostagarcia;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 *
 * @author Equipo
 */
public class ArrayStack<E> implements Stack<E> {

    private E[] data = (E[]) new Object[2];
    private int size = 0;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E peek() {
        if (size == 0) {
            throw new NoSuchElementException("error al mirar el ultimo elemento de la pila vacia");
        }
        return data[size - 1];
    }

    @Override
    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        } else {
            size = size - 1;
            E temporal = data[size];
            data[size] = null;

            return temporal;

        }
        //tengo la duda de que asi sea pop, quisiera que revisen bien
    }

    @Override
    public void push(E recibido) {

        if (data.length == size) {
            E arreglo_nuevo[] = (E[]) new Object[size * 2];
            int contador = 0;

            for (E indice : data) {
                arreglo_nuevo[contador] = indice;//HAY UNA FALLA AQUI EN ALGUNA PARTE DE ESTE PUSH
                contador++;
            }
            arreglo_nuevo[contador] = recibido;
            size++;
            data = arreglo_nuevo;
        } else {
            data[size] = recibido;
            size++;
        }

    }
}
