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
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Insertar al inicio \n2.-Eliminar al inicio \n3.-Insertar al final \n4.-Eliminar al final "
                    + "                                           \n5.-Recorrer \n6.-Recorrer(Recursivo) \n7.-Insertar antes de x \n8.-Insertar despues de x \n9.-Salir"));
            switch(opcion)
            {
                case 1:
                contador++;
                l.inserta_inicio(1);
                l.inserta_inicio(2);
                l.inserta_inicio(5);
                JOptionPane.showMessageDialog(null,"SE INSERTARON ELEMENTOS AL INICIO");break;
                case 2:
                contador++;
                l.elimina_primero();
                JOptionPane.showMessageDialog(null, "SE HA ELIMINADO EL PRIMER ELEMENTO DE LA LISTA");break;
                case 3:
                contador++;
                l.inserta_final(1);
                l.inserta_final(2);
                l.inserta_final(5);
                JOptionPane.showMessageDialog(null, "SE INSERTARON ELEMENTOS AL FINAL");break;
                case 4:
                contador++;
                l.elimina_ultimo();
                JOptionPane.showMessageDialog(null, "SE HA ELIMINADO EL ULTIMO ELEMENTO DE LA LISTA");break;
                case 5:
                contador++;
                System.out.println("\nEJECUCION NUMERO " + contador);
                l.recorrer();
                JOptionPane.showMessageDialog(null, "LISTA RECORRIDA DE FORMA NORMAL");break;
                case 6:
                contador++;
                System.out.println("\nEJECUCION NUMERO " + contador);
                l.recorrer_r(l.getInicio());
                JOptionPane.showMessageDialog(null, "LISTA RECORRIDA DE FORMA RECURSIVA");break;
                case 7:
                contador++;
                l.insertar_antes_X(3,5);
                JOptionPane.showMessageDialog(null, "SE HA INSERTADO UN ELEMENTO ANTES DE OTRO");break;
                case 8:
                contador++;
                l.inserta_despues_x(4,3);
                JOptionPane.showMessageDialog(null, "SE HA INSERTADO UN ELEMENTO DESPUES DE OTRO");break;
             }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }while(opcion != 9);
    }
}
