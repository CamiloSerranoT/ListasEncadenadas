/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblementeencadenadacircular;

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

        if (raiz == null) {
            nuevo.setSig(raiz);
            nuevo.setAnt(raiz);
            raiz = nuevo;
        } else {
            if (raiz.getSig() == raiz) {
                raiz.setSig(nuevo);
                nuevo.setAnt(raiz);
                nuevo.setSig(raiz);
                raiz.setAnt(nuevo);
            } else {
                Nodo reco = raiz;
                while (reco.getSig() != raiz) {
                    reco = reco.getSig();
                }
                reco.setSig(nuevo);
                nuevo.setAnt(reco);
                nuevo.setSig(raiz);
                raiz.setAnt(nuevo);
            }
        }
    }

    public boolean comEstado() {
        boolean com = false;
        if (raiz != null) {
            com = true;
        }
        return com;
    }

    public int extraerPila() {
        Nodo aux = new Nodo();
        Nodo reco = raiz;

        if (raiz == null) {
            return Integer.MAX_VALUE;
        } else {
            if (raiz.getSig() == raiz) {
                int informacion = raiz.getInfo();
                raiz = null;
                return informacion;
            } else {
                while (reco.getSig().getSig() != raiz) {
                    reco = reco.getSig();
                }
                int informacion = reco.getSig().getInfo();
                aux = reco.getSig();
                aux.setAnt(null);
                aux.setSig(null);
                reco.setSig(raiz);
                raiz.setAnt(reco);
                return informacion;
            }
        }
    }

    public int extraerCola() {
        if (raiz == null) {
            return Integer.MAX_VALUE;
        } else {
            if (raiz.getSig() == raiz) {
                int informacion = raiz.getInfo();
                raiz = null;
                return informacion;
            } else {
                int informacion = raiz.getInfo();
                raiz = raiz.getSig();

                return informacion;
            }
        }

    }

    public void imprimir() {
        System.out.println("\n\n       |==================================|");
        if (raiz != null) {
            Nodo reco = raiz;

            System.out.println("             Listado de los elementos");

            while (reco != raiz) {
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
