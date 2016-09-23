/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
import javax.swing.*;
public class Main {
    public static void main(String[] args) 
    {
        ListaSimplementeLigada l = new ListaSimplementeLigada();
        int opcion = 0;
        int contador = 0;
        do
        { 
            try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Insertar al inicio \n2.-Insertar al final \n3.-Insertar antes de X \n4.-Insertar despues de X "
                    + "\n5.-Eliminar primero \n6.-Eliminar ultimo \n7.-Eliminar elemento \n8.-Eliminar antes \n9.-Busca desordenado \n10.-Busca recursivo"
                    + "\n11.-Recorre recursivo \n12.-Recorre iterativo \n13.-Insertar ordenado \n14.-Obtener dato en posicion \n15.-Salir"));
            switch(opcion)
            {
                case 1:
                contador++;
                l.inserta_inicio(1);
                l.inserta_inicio(2);
                l.inserta_inicio(5);
                System.out.println("SE INSERTARON ELEMENTOS AL INICIO");break;
                case 2:
                contador++;
                l.inserta_final(1);
                l.inserta_final(2);
                l.inserta_final(5);
                System.out.println("SE INSERTARON ELEMENTOS AL FINAL");break;
                case 3:
                contador++;
                l.insertar_antes_X(3,5);
                System.out.println("SE HA INSERTADO UN ELEMENTO ANTES DE OTRO");break;
                case 4:
                contador++;
                l.inserta_despues_x(4,3);
                System.out.println("SE HA INSERTADO UN ELEMENTO DESPUES DE OTRO");break;
                case 5:
                contador++;
                l.elimina_primero();
                System.out.println("SE HA ELIMINADO EL PRIMER ELEMENTO DE LA LISTA");break;
                case 6:
                contador++;
                l.elimina_ultimo();
                System.out.println("SE HA ELIMINADO EL ULTIMO ELEMENTO DE LA LISTA");break;
                case 7:
                contador++;
                l.elimina_elemento(3);break;
                case 8:
                contador++;
                l.elimina_antes(5);break;
                case 9:
                contador++;
                l.busca_desordenado(4);break;
                case 10:
                contador++;
                l.busca_recursivo(l.getInicio(),3);break;
                case 11:
                contador++;
                System.out.println("\nEJECUCION NUMERO " + contador);
                l.recorrer_r(l.getInicio());
                System.out.println("\nLISTA RECORRIDA DE FORMA RECURSIVA");break;
                case 12:
                contador++;
                System.out.println("\nEJECUCION NUMERO " + contador);
                l.recorrer();
                System.out.println("\nLISTA RECORRIDA DE FORMA NORMAL");break;
                case 13:
                l.insertar_Ordenado(4);break;
                case 14:
                System.out.println("EL DATO EN LA POSICION INDICADA ES " + l.obtenerDatoEnPosicion(3));break;
                case 15:
                JOptionPane.showMessageDialog(null, "HASTA LUEGO !!!");break;
             }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }while(opcion != 15);
    }
}
