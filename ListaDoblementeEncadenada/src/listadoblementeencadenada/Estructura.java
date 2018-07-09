/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeencadenada;

/**
 *
 * @author CAMILO
 */
public class Estructura {

    private Nodo raiz;
    private Nodo ultimo;
    private int altura;

    public Estructura() {
        raiz = null;
        ultimo = null;
        altura = 0;
    }

    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        Nodo reco = new Nodo();
        reco = raiz;

        if (raiz == null) {
            nuevo.setSig(raiz);
            nuevo.setAnt(raiz);
            raiz = nuevo;
            ultimo = nuevo;
        } else {
            if (raiz.getSig() == raiz) {
                raiz.setSig(nuevo);
                raiz.setAnt(nuevo);
                nuevo.setAnt(raiz);
                nuevo.setSig(raiz);
                ultimo = ultimo.getSig();
            } else {
                ultimo.setSig(nuevo);
                raiz.setAnt(nuevo);
                nuevo.setAnt(ultimo);
                nuevo.setSig(raiz); 
                ultimo = ultimo.getSig();
            }
        }
        altura++;
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
            if (raiz.getSig() == raiz) {
                int informacion = raiz.getInfo();
                raiz = null;
                ultimo = null;
                altura = 0;
                return informacion;
            } else {
                if (altura != 2) {
                    do {
                        reco = reco.getSig();
                    } while (reco.getSig() == ultimo);
                }

                int informacion = reco.getSig().getInfo();
                ultimo.setSig(null);
                ultimo.setAnt(null);
                reco.setSig(raiz);
                raiz.setAnt(reco);
                ultimo = reco;
                altura--;
                return informacion;
            }
        }
    }

    public int extraerCola() {
        if (raiz.getSig() == raiz) {
            int informacion = raiz.getInfo();
            raiz = null;
            ultimo = null;
            altura = 0;
            return informacion;
        } else {
            if (raiz != null) {
                int informacion = raiz.getInfo();
                raiz = raiz.getSig();
                ultimo.setSig(raiz);
                raiz.setAnt(ultimo);
                altura--;
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

            for (int i = 0; i < altura; i++) {
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
