/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class Nodo<T extends Comparable<T>> {
    private T dato;//Este es el dato que va a contener el nodo
    private Nodo<T> siguiente;//Esta es la liga al siguinte nodo

    public Nodo(){//Este es el constructor por default e inicializa los datos en nulo.
        dato = null;
        siguiente = null;
    }
    
    public Nodo(T dato){//Este es el constructor que inicializa el dato en un valor especifico
        this.dato = dato;
        siguiente = null;
    }
    
    public T getDato() {//Este es el get de la propiedad dato
        return dato;
    }

    public void setDato(T dato) {//Este es el set de la propiedad dato
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    public String toString(){
        return "[" + dato + "]";
    }
}

    /*@Override
    public T compareTo(NodoComparableComparable o){
        return this.dato.compareTo(o.getDato());
    }*/
    
    
    
    //-1  0  1
    // <  =  > 
    //Leer algoritmo de Merkle Hellman (Algoritmo de encriptacion).
