/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class ListaSimplementeLigada<T extends Comparable<T>>{
    private Nodo<T> inicio;//Este es el inicio de la lista
    
    public ListaSimplementeLigada(){
        inicio = null;//Al principio de la lista está vacia
    }

    public Nodo<T> getInicio() {//Este es el get del inicio
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {//Este es el set del inicio
        this.inicio = inicio;
    }
    
    public void recorrer(){//Este metodo recorre la lista ligada
        Nodo<T> aux = inicio;
        while(aux != null){
            System.out.print(aux + "-->");
            aux = aux.getSiguiente();
        }
    }
    
    public void recorrer_r(Nodo<T> aux){
        if(aux != null){
            System.out.print(aux.getDato());
            recorrer_r(aux.getSiguiente());
        }
    }    
    
    public void inserta_inicio(T dato){
        Nodo<T> aux = new Nodo<T>(dato);//Aqui ya creo un nodo con un dato mientras dure el metodo
        if(inicio == null)
            inicio = aux;
        else
            aux.setSiguiente(inicio);
            inicio = aux;
    }
    
    public void inserta_final(T dato){
        Nodo<T> aux = new Nodo<T>(dato);
        if(inicio == null){
            inicio = aux;
        }else{
            Nodo<T> aux2 = inicio;
            while(aux2.getSiguiente() != null)
            {
                aux2 = aux2.getSiguiente();
            }
            aux2.setSiguiente(aux);
        }
    }
        
    public void elimina_primero(){
        if(inicio != null){
            Nodo<T> aux = inicio;
            inicio = aux.getSiguiente();
            aux.setSiguiente(null);
        }
    }
    
    public void elimina_ultimo(){
        if(inicio != null){
            Nodo<T> aux = inicio;
            Nodo<T> aux2 = null;
            while(aux.getSiguiente() != null)
            {
                aux2 = aux;
                aux = aux.getSiguiente();
            }
            if(aux2 == null)
                inicio = null;
            else
                aux2.setSiguiente(null);
        }
    }
    
    public void insertar_antes_X(T dato)
    {
        boolean bandera;
        //P es inicio, Q es un nodo, T es otro nodo
        Nodo<T> aux = new Nodo<T>(dato);
            aux = inicio;
            bandera = true;
        while(aux.getDato().compareTo(dato) == 0)
        {
            
        }
    }
}
