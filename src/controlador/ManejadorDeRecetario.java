/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Informacion_general;
import modelo.Ingrediente;
import modelo.Paso;
import modelo.Receta;
import modelo.Recetario;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author mati
 */
public class ManejadorDeRecetario extends DefaultHandler {
    
    private String valor;
    private Recetario recetario;
    private Receta recetita;
    private Informacion_general ig;
    private Ingrediente ingr;
    private Paso paso;
    
    public ManejadorDeRecetario(Recetario recetario) {
        this.recetario = recetario;
    }
    
    @Override
    public void startDocument() throws SAXException {
        
    }
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //System.out.println(localName);
        if (localName.equals("receta")) {
            recetita = new Receta();
            this.recetario.add(recetita);
        }
        if (localName.equals("informacion_general")) {
            ig = new Informacion_general();
            this.recetita.setInformacion_general(ig);
        }
        if (localName.equals("ingrediente")) {
            ingr = new Ingrediente();
            ingr.setCantidad(attributes.getValue("cantidad"));
            ingr.setUnidad(attributes.getValue("unidad"));
            this.recetita.getListaIngredientes().add(ingr);
        }
        if (localName.equals("paso")) {
            paso = new Paso();
            paso.setNumero(attributes.getValue("numero"));
            this.recetita.getListaPasos().add(paso);
        }
        if (localName.equalsIgnoreCase("tiempo")) {
            ig.setUnidad(attributes.getValue("unidad"));
        }
    }
    
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        this.valor = new String(ch, start, length);
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        
        if (localName.equalsIgnoreCase("nombre")) {
            this.recetita.setNombre(this.valor);
        }
        if (localName.equalsIgnoreCase("categoria")) {
            this.recetita.setCategoria(this.valor);
        }
        if (localName.equalsIgnoreCase("comensales")) {
            this.ig.setComensales(Integer.parseInt(this.valor));
        }
        if (localName.equalsIgnoreCase("tiempo")) {
            this.ig.setTiempo(Integer.parseInt(this.valor));
        }
        if (localName.equalsIgnoreCase("dificultad")) {
            this.ig.setDifilcutad(this.valor);
        }
        if (localName.equalsIgnoreCase("ingrediente")) {
            this.ingr.setNombre(this.valor);
        }
        if (localName.equalsIgnoreCase("paso")) {
            this.paso.setDescripcion(this.valor);
        }
        
    }
    
    @Override
    public void endDocument() throws SAXException {
        
    }
    
}
