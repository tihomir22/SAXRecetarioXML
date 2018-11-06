/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorDeRecetario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Recetario;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author mati
 */
public class SAXRecetario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recetario recetario = new Recetario();
        int opcion = 999;
        Scanner teclado = new Scanner(System.in);
        String ruta = "recetario.xml";
        String entrada = "";

        while (opcion != 0) {
            mostrarMenu();
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:
                    teclado.nextLine();
                    System.out.println("Introduzca ruta o dejalo en blanco para usar la ruta por defecto");
                    entrada = teclado.nextLine();
                    if (entrada.length() != 0) {
                        ruta = entrada;
                    }
                    break;

                case 2:
                    try {
                        XMLReader reader = XMLReaderFactory.createXMLReader();
                        reader.setContentHandler(new ManejadorDeRecetario(recetario));
                        reader.parse(new InputSource(new FileInputStream(ruta)));
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(SAXRecetario.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(SAXRecetario.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SAXException ex) {
                        Logger.getLogger(SAXRecetario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                case 3:
                    recetario.imprimirRecetas();
                    break;
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("1.- Elegir fichero xml");
        System.out.println("2.- Leer un documento y crear recetario");
        System.out.println("3.- Mostrar el recetario");
    }

}
