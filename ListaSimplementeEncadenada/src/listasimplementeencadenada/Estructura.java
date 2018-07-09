/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimplementeencadenada;

/**
 *
 * @author CAMILO
 */
public class Estructura {

    private Nodo raiz;

    public Estructura() {
        raiz = null;
    }

    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);

        Nodo reco = new Nodo();
        reco = raiz;

        if (raiz == null) {
            raiz = nuevo;
        } else {
            if (raiz.getSig() == null) {
                raiz.setSig(nuevo);
            } else {
                if (raiz.getSig() != null) {
                    while (reco.getSig() != null) {
                        reco = reco.getSig();
                    }
                    reco.setSig(nuevo);
                }
            }
        }
        imprimir();
    }

    public boolean comEstado() {
        boolean com = false;
        if (raiz != null) {
            com = true;
        }
        return com;
    }

    public int extraerPila() {
        Nodo reco = raiz;

        if (raiz == null) {
            return Integer.MAX_VALUE;
        } else {
            if (raiz.getSig() == null) {
                int informacion = raiz.getInfo();
                raiz = null;
                return informacion;
            } else {
                while (reco.getSig().getSig() != null) {
                    reco = reco.getSig();
                }
                int informacion = reco.getSig().getInfo();
                reco.setSig(null);
                return informacion;
            }
        }
    }

    public int extraerCola() {
        if (raiz.getSig() != null) {
            int informacion = raiz.getInfo();
            raiz = raiz.getSig();
            return informacion;
        } else {
            if (raiz.getSig() == null) {
                int informacion = raiz.getInfo();
                raiz = null;
                return informacion;
            } else {
                return Integer.MAX_VALUE;
            }

        }
    }

    public void imprimir() {
        System.out.println("\n\n       |==================================|");
        if (raiz != null) {
            Nodo reco = raiz;

            System.out.println("             Listado de los elementos");

            while (reco != null) {
                System.out.print("                       [" + reco.getInfo() + "]\n");
                reco = reco.getSig();
            }
        } else {
            System.out.println("       |          LISTADO  VACIO          |");
        }
        System.out.println("       |==================================|");
        System.out.println("\n\n");

    }

}
