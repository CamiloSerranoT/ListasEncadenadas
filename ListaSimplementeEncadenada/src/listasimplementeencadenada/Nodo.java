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
public class Nodo {

    private int info;
    private Nodo sig;

    public Nodo() {
        sig = null;
    }

    public Nodo(int info) {
        this.info = info;
        this.sig = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
