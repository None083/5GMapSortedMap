/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author noelia
 * 
 * PARTE A
* Aplica lo estudiado realizando un "Traductor" de palabras. Para ello, 
* el traductor se crea usando dos objetos de tipo String, de forma que 
* la clave es una palabra en el idioma que tú elijas y el valor es la 
* traducción española. Es indispensable que las palabras extranjeras estén 
* ordenadas alfabéticamente.

* Inicialmente el traductor se crea vacío, sin registros. 
* Existirá un método que servirá para guardar una entrada y recibirá dos palabras 
* (palabraExtranjera, palabraEspañol) para ir guardando traducciones.
* Se deben poder borrar entradas y modificar entradas ya creadas, 
* así como realizar la traducción de una palabra dada.
* También debe haber dos métodos: una para crear una lista con las palabras no españolas 
* que hay en el traductor y otro para obtener las palabras en español.

* Realiza una clase conteniendo el main() y 10 registros en tu traductor. 
* Prueba los métodos realizados.
* 
 */
public class Traductor {
    
    private Map<String, String> traduccion;

    public Traductor() {
        this.traduccion = new TreeMap();
    }

    public void guardarEntrada(String palabraExtranjera, String palabraEspaniol){
        this.traduccion.put(palabraExtranjera, palabraEspaniol);
    }
    
    public void borrarEntrada(String palabraExtranjera){
        this.traduccion.remove(palabraExtranjera);
    }
    
    public void borrarEntrada(String palabraExtranjera, String palabraEspaniol){
        this.traduccion.remove( palabraExtranjera, palabraEspaniol);
    }
    
    public void modificarEntrada(String palabraExtranjera, String palabraEspaniol){
        this.traduccion.replace(palabraExtranjera, palabraEspaniol);
    }
    
    public String traduccionPalabra(String palabraExtranjera){
        return this.traduccion.get(palabraExtranjera);
    }
    
//    public String[] listaPalabrasExtranjeras(){
//        return (String[]) this.traduccion.keySet().toArray();
//    }
    
    public ArrayList<String> listaPalabrasExtranjerasArrayList(){
        return new ArrayList<>(this.traduccion.keySet());
    }
    
//    public String[] listaPalabrasEspaniol(){
//        return (String[]) this.traduccion.values().toArray();
//    }
    
    public ArrayList<String> listaPalabrasEspaniolArrayList(){
        return new ArrayList<>(this.traduccion.values());
    }
    
}
