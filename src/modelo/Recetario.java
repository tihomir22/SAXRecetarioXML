/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Recetario extends ArrayList<Receta> {
    
    public Recetario() {
    }
    
    public int getModCount() {
        return modCount;
    }
    
    public void setModCount(int modCount) {
        this.modCount = modCount;
    }
    
    public void imprimirRecetas() {
        for (int i = 0; i < this.size(); i++) {
            this.get(i).imprimirFormateado(i);
        }
    }
    
    @Override
    public String toString() {
        return "Recetario{" + '}';
    }
    
}
