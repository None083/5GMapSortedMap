/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package paquetea;

import java.util.ArrayList;

/**
 *
 * @author noelia
 */
public class Prueba {

    public static void main(String[] args) {
        
        Traductor inglesEspaniol = new Traductor();
        
        inglesEspaniol.guardarEntrada("Flower", "Flor");
        inglesEspaniol.guardarEntrada("Cat", "Gato");
        inglesEspaniol.guardarEntrada("Candle", "Vela");
        inglesEspaniol.guardarEntrada("Handcream", "Crema de manos");
        inglesEspaniol.guardarEntrada("Plate", "Plato");
        inglesEspaniol.guardarEntrada("Earrings", "Pendientes");
        inglesEspaniol.guardarEntrada("Cup", "Taza");
        inglesEspaniol.guardarEntrada("Book", "Libro");
        inglesEspaniol.guardarEntrada("Paintbrush", "Pincel");
        inglesEspaniol.guardarEntrada("Boots", "Botas");
        
        ArrayList<String> palabras = inglesEspaniol.listaPalabrasExtranjerasArrayList();
        
        for (int i = 0; i < palabras.size(); i++) {
            System.out.println(palabras.get(i));
        }

        inglesEspaniol.borrarEntrada("Plate");
        inglesEspaniol.modificarEntrada("Book", "Reservar");
        
        palabras = inglesEspaniol.listaPalabrasEspaniolArrayList();
        
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
    }
}
