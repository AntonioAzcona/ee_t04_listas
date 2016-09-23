/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
* @author AZCONA GONZÁLEZ JOSÉ ANTONIO
 * Materia: Estructura de Datos
 * Docente: Lic. León Felipe Villavicencio Fernandez
 * Hora: 10:00 - 11:00
 * Nombre del trabajo: ee_t04_listas(Tarea04)
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
    
    public void insertar_antes_X(T dato, T referencia) throws LinkedListException {
        if (inicio == null) {
            throw new LinkedListException("\nLISTA VACIA");
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
            throw new LinkedListException("\nEL DATO DADO COMO REFERENCIA NO ESTÁ EN LA LISTA");
        }
    }
    
    public void inserta_despues_x(T dato, T referencia) throws LinkedListException {
        if (inicio == null) {
            throw new LinkedListException("\nLISTA VACIA");
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
            throw new LinkedListException("\nEL T DADO COMO REFERENCIA NO ESTÁ EN LA LISTA");
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
    
    public void elimina_elemento(T dato)
    {
        Nodo<T> T = new Nodo<T>();
        Nodo<T> Q = inicio;
        bandera = true;
        while((!Q.getDato().equals(dato)) && (bandera == true)){
            if(Q.getSiguiente() != null)
            {
                T = Q;
                Q = Q.getSiguiente();
            }else{
                bandera = false;
            }
        }
        if(bandera == false){
            System.out.println("\nEL ELEMENTO CON INFORMACION X NO SE ENCUENTRA EN LA LISTA");
        }else{
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
        Nodo<T> Q = new Nodo<T>();
        Nodo<T> T = new Nodo<T>();
        Nodo<T> R = new Nodo<T>();
        Nodo<T> I = inicio;
        if(I.getDato().equals(dato)){
            System.out.println("\nNO EXISTE UN NODO QUE PRESEDA AL QUE CONTIENE X");
        }else{
            Q = inicio;
            T = inicio;
            bandera = true;
        }
        while(!Q.getDato().equals(dato) && bandera == true){
            if(Q.getSiguiente() != null){
                R = T;
                T = Q;
                Q = Q.getSiguiente();
            }else{
                bandera = false;
            }
        }
        if(bandera == false){
            System.out.println("\nEL ELEMENTO NO SE ENCUENTRA EN LA LISTA");
        }else{
            if(I.getSiguiente() == Q){
                inicio = Q;
            }else{
                R.setSiguiente(Q);
            }
        }
    }
    
    public void busca_desordenado(T dato){
      Nodo<T> Q = inicio;
      while((Q != null) && !(Q.getDato().equals(dato))){
          Q = Q.getSiguiente();
      }
      if(Q == null)
      {
          System.out.println("\nEL ELEMENTO NO SE ENCUENTRA EN LA LISTA");
      }else{
          System.out.println("\nEL ELEMENTO SI SE ENCUENTRA EN LA LISTA");
      }
    }
    
    public void busca_recursivo(Nodo<T> p, T dato){
        if(p != null)
        {
            if(p.getDato().equals(dato)){
                System.out.println("\nEL ELEMENTO SE ENCUENTRA EN LA LISTA");
            }else{
                busca_recursivo(p.getSiguiente(),dato);
            }
        }else{
            System.out.println("\nEL ELEMENTO NO SE ENCUENTRA EN LA LISTA");
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
    
    public void insertar_Ordenado(Comparable dato)
    {
        Nodo aux = new Nodo< >(dato);
     if(inicio == null)
     {
        inicio = aux;
     }else
     {
        Nodo aux2 = inicio;
        Nodo ant = null;
       while (aux2.getSiguiente() != null && dato.compareTo(aux2.getDato()) >= 0)
      {
         ant = aux2;
         aux2 = aux2.getSiguiente();
      }
         if(dato.compareTo(aux2.getDato()) >= 0) {
         aux2.setSiguiente(aux);
      }else if(ant == null)
      {
         aux.setSiguiente(aux2);
         inicio=aux;
      }else
      {   
         aux.setSiguiente(aux2);
         ant.setSiguiente(aux);
      }   
     }
    }
}
