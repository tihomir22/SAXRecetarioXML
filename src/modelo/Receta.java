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
public class Receta {

    private String nombre;
    private String categoria;
    private Informacion_general Informacion_general;
    private ArrayList<Ingrediente> listaIngredientes = new ArrayList<>();
    private ArrayList<Paso> listaPasos = new ArrayList<>();

    public Receta(String nombre, String categoria, Informacion_general Informacion_general) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.Informacion_general = Informacion_general;
    }

    public Receta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Informacion_general getInformacion_general() {
        return Informacion_general;
    }

    public void setInformacion_general(Informacion_general Informacion_general) {
        this.Informacion_general = Informacion_general;
    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public ArrayList<Paso> getListaPasos() {
        return listaPasos;
    }

    public void setListaPasos(ArrayList<Paso> listaPasos) {
        this.listaPasos = listaPasos;
    }

    public void imprimirFormateado(int numReceta) {
        System.out.println("**************RECETA NUMERO " + numReceta + " **************");
        System.out.println("nombre receta " + this.nombre);
        System.out.println("categoria receta " + this.categoria);
        System.out.println("\t" + "INFORMACION GENERAL");
        System.out.println("\t" + "comensales " + this.Informacion_general.getComensales() + " \n\t" + "tiempo " + this.Informacion_general.getTiempo() + " \n\t" + "unidad " + this.Informacion_general.getUnidad() + " \n\t" + "difilcutad " + this.Informacion_general.getDifilcutad());
        System.out.println("\t\t" + " LISTA INGREDIENTES");
        for (int i = 0; i < this.listaIngredientes.size(); i++) {
            System.out.println("\t\t" + "nombre ingrediente " + this.listaIngredientes.get(i).getNombre());
            System.out.println("\t\t" + "unidad " + this.listaIngredientes.get(i).getUnidad());
            System.out.println("\t\t" + "cantidad " + this.listaIngredientes.get(i).getCantidad());
        }
        System.out.println("\t\t\t" + " LISTA PASOS");
        for (int i = 0; i < this.listaPasos.size(); i++) {
            System.out.println("\t\t\t" + "numero " + this.listaPasos.get(i).getNumero());
            System.out.println("\t\t\t" + "descripcion " + this.listaPasos.get(i).getDescripcion());
        }

    }

    @Override
    public String toString() {
        return "Receta{" + "nombre=" + nombre + ", categoria=" + categoria + ", Informacion_general=" + Informacion_general + ", listaIngredientes=" + listaIngredientes + ", listaPasos=" + listaPasos + '}';
    }

}
