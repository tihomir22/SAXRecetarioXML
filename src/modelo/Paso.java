/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mati
 */
public class Paso {

    private String numero;
    private String descripcion;

    public Paso(String numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public Paso() {
       
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Paso{" + "numero=" + numero + ", descripcion=" + descripcion + '}';
    }

}
