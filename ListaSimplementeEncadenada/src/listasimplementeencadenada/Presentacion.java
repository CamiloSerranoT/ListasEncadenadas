/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimplementeencadenada;

import java.util.Scanner;

/**
 *
 * @author CAMILO
 */
public class Presentacion {

    static Scanner scan = new Scanner(System.in);

    public int menu(int opcion) {
        boolean comprobarMenu = false;

        do {
            System.out.println("\t         __________________");
            System.out.println("\t        |                  |");
            System.out.println("\t        |      MENU        |");
            System.out.println("\t        | 1.Insertar       |");
            System.out.println("\t        | 2.Eliminar(Pila) |");
            System.out.println("\t        | 3.Eliminar(Cola) |");
            System.out.println("\t        | 4.Salir          |");
            System.out.println("\t        |__________________|");

            System.out.println("\n\t          Digite la opcion: ");

            opcion = scan.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                comprobarMenu = true;
            } else {
                System.out.println("\n\n\t |==========================|");
                System.out.println("\t | Solo valores entre [1/4] |");
                System.out.println("\t |==========================|\n\n\n\n");
            }
        } while (comprobarMenu == false);

        return opcion;
    }

    public void estadoEliminar() {
        System.out.println("\n\n       |==================================|");
        System.out.println("       |   NO SE PUEDE ELIMINAR, YA QUE   |");
        System.out.println("       |    YA QUE LA LISTA ESTA VACIA    |");
        System.out.println("       |==================================|");
    }

}
