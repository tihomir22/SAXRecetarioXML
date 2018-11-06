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
public class Informacion_general {

    private int comensales;
    private int tiempo;
    private String unidad;
    private String difilcutad;

    public Informacion_general(int comensales, int tiempo, String unidad, String difilcutad) {
        this.comensales = comensales;
        this.tiempo = tiempo;
        this.unidad = unidad;
        this.difilcutad = difilcutad;
    }

    public Informacion_general() {
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getDifilcutad() {
        return difilcutad;
    }

    public void setDifilcutad(String difilcutad) {
        this.difilcutad = difilcutad;
    }

    @Override
    public String toString() {
        return "Informacion_general{" + "comensales=" + comensales + ", tiempo=" + tiempo + ", unidad=" + unidad + ", difilcutad=" + difilcutad + '}';
    }

}
