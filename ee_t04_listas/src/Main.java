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
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Insertar al inicio \n2.-Eliminar al inicio \n3.-Insertar al final \n4.-Eliminar al final \n5.-Recorrer \n6.-Recorrer(Recursivo) \n7.-Salir"));
            switch(opcion)
            {
                case 1:
                contador++;
                JOptionPane.showMessageDialog(null,"SE INSERTARON AL INICIO LOS NUMEROS 1 2 3");
                l.inserta_inicio(1);
                l.inserta_inicio(2);
                l.inserta_inicio(3);break;
                case 2:
                contador++;
                l.elimina_primero();
                JOptionPane.showMessageDialog(null, "SE HA ELIMINADO EL PRIMER ELEMENTO DE LA LISTA");break;
                case 3:
                contador++;
                JOptionPane.showMessageDialog(null, "SE INSERTARON AL FINAL LOS NUMEROS 1 2 3");
                l.inserta_final(1);
                l.inserta_final(2);
                l.inserta_final(3);break;
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
            }
        }while(opcion != 7);
    }
}
