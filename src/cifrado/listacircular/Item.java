/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado.listacircular;

/**
 *
 * @author jonas
 */
public class Item {
    
    private char letra;
    private Item siguiente;

    public Item(char letra) {
        this.letra = letra;
        this.siguiente = null;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Item getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Item siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
