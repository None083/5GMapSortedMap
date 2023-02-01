/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetec;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author noelia
 * 
 * PARTE C
 * En una estructura map, asocia a cada objeto de tipo Ejercito un identificador único. 
 * Se deben poder guardar Ejércitos con sus identificadores asociados, 
 * obtener un Ejercito según su identificador y obtener todos los Ejércitos 
 * contenidos en la estructura map.
 * 
 */
public class PruebaEjercito {

    public static void main(String[] args) {
        
        Map<String, Ejercito> armada = new TreeMap<>();
        
        Ejercito prueba = new Ejercito();
        
        prueba.alistarSoldado(new Soldado("09086782N", "Monty", "Perro", "Deaguas", 1));
        prueba.alistarSoldado(new Soldado());
        
        aniadirEjercito("01", new Ejercito(), armada);
        aniadirEjercito("02", new Ejercito(), armada);
        aniadirEjercito("03", new Ejercito(), armada);
        aniadirEjercito("04", prueba, armada);
        
        System.out.println(mostrarEjercito("02", armada));
        System.out.println(obtenerEjercito(armada));
        
    }
    
   private static void aniadirEjercito(String key, Ejercito e, Map<String, Ejercito> armada){
      armada.put(key, e);
   }
   
   private static Ejercito mostrarEjercito(String key, Map<String, Ejercito> armada){
       return armada.get(key);
   }
   
   private static void imprimiArmada(Map<String, Ejercito> armada){
       for (Map.Entry<String, Ejercito> entrada : armada.entrySet()) {
           Object key = entrada.getKey();
           Object val = entrada.getValue();
           System.out.println("Key: " + key + " -- value: " + val); 
       }
   }
   
   private static ArrayList<Ejercito> obtenerEjercito(Map<String, Ejercito> armada){
       return new ArrayList<>(armada.values());
   }
    
}
