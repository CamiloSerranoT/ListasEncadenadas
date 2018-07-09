/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeencadenada;

import java.util.Scanner;

/**
 *
 * @author CAMILO
 */
public class ListaDoblementeEncadenada {

    static Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estructura prueba = new Estructura();
        Presentacion presentar = new Presentacion();

        int opcion = 0;
        int valor = 0;

        do {
            opcion = presentar.menu(opcion);

            switch (opcion) {
                case 1:
                    System.out.println("\t            Digite valor: ");
                    valor = scan.nextInt();
                    prueba.insertar(valor);
                    break;
                case 2:
                    if (prueba.comEstado() != true) {
                        presentar.estadoEliminar();
                    } else {
                        System.out.println("\n\n\t          Se elimino el: " + prueba.extraerPila());
                        prueba.imprimir();
                    }
                    break;
                case 3:
                    if (prueba.comEstado() != true) {
                        presentar.estadoEliminar();
                    } else {
                        System.out.println("\n\n\t          Se elimino el: " + prueba.extraerCola());
                        prueba.imprimir();
                    }
                default:
                    prueba.imprimir();
                    break;
            }
        } while (opcion != 4);
    }

}
