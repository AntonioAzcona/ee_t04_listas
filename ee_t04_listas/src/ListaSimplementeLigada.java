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
    boolean bandera;
    
    public ListaSimplementeLigada(){
        inicio = null;//Al principio de la lista está vacia
    }

    public Nodo<T> getInicio() {//Este es el get del inicio
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {//Este es el set del inicio
        this.inicio = inicio;
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
    public void insertar_antes_X(T dato, T referencia) throws LinkedListException {
        if (inicio == null) {
            throw new LinkedListException("La lista está vacía");
        }
        Nodo<T> Q = inicio;
        Nodo<T> T = null;
        boolean band = false;
        while (!Q.getDato().equals(referencia) && !band) {
            if (Q.getSiguiente() != null) {
                T = Q;
                Q = Q.getSiguiente();
            } else {
                band = true;
            }

        }
        if (!band) {
            Nodo<T> X = new Nodo<>(dato);
            if (Q == inicio) { 
                X.setSiguiente(inicio);
                inicio = X;
            } else {
                T.setSiguiente(X);
                X.setSiguiente(Q);
            }
        } else {
            throw new LinkedListException("El dato dado como referencia no está en la lista");
        }
    }
    
    public void inserta_despues_x(T dato, T referencia) throws LinkedListException {
        if (inicio == null) {
            throw new LinkedListException("La lista está vacía");
        }
        Nodo<T> Q = inicio;
        boolean band = false;
        while (!Q.getDato().equals(referencia) && !band) {
            if (Q.getSiguiente() != null) {
                Q = Q.getSiguiente();
            } else {
                band = true;
            }

        }
        if (!band) {
            Nodo<T> T = new Nodo<>(dato);
            T.setSiguiente(Q.getSiguiente());
            Q.setSiguiente(T);
        } else {
            throw new LinkedListException("El T dado como referencia no está en la lista");
        }
    }
          
    public /*T*/void elimina_elemento(T dato)
    {
        Nodo<T> T = new Nodo<T>();
        Nodo<T> Q = inicio;
        bandera = true;
        while(Q.getDato().compareTo(dato) == -1 && bandera == true)
        {
            if(Q.getSiguiente() != null)
            {
                T = Q;
                Q = Q.getSiguiente();
            }else{
                bandera = false;
            }
        }
        if(bandera == false)
        {
            System.out.println("EL ELEMENTO CON INFORMACION X NO SE ENCUENTRA EN LA LISTA");
        }else
        {
            if(inicio == Q)
            {
                inicio = Q.getSiguiente();
            }else{
                T.setSiguiente(Q.getSiguiente());
            }
        }
    }
    
    public void elimina_antes(T dato)
    {
        Nodo<T> T = new Nodo<T>();
        Nodo<T> Q = new Nodo<T>();
        Nodo<T> R = new Nodo<T>();
        if(inicio.getDato().compareTo(dato) == 0)
        {
            System.out.println("No existe un nodo que preceda al que contiene x");
        }else{
            Q = inicio;
            T = inicio;
            bandera = true;
        }
        while(Q.getDato().compareTo(dato) == -1 && bandera == true)
        {
            if(Q.getSiguiente() != null)
            {
                R = T;
                T = Q;
                Q = Q.getSiguiente();
            }else{
                bandera = false;
            }
        }
        if(bandera == false)
        {
            System.out.println("El elemento no se encuentra en la lista");
        }else{
            if(inicio.getSiguiente() == Q)
            {
                inicio = Q;
            }else{
                R.setSiguiente(Q);
            }
        }
    }
}
