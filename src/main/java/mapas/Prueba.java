/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author noelia
 */
public class Prueba {

    public static void main(String[] args) {
        
        Map<String, Integer> nombresEdades = new HashMap();
        nombresEdades.put("Vico", 25);
        nombresEdades.put("Vico", 55); // se reemplaza
        
        System.out.println("Nº elementos del map " + nombresEdades.size());
        
        for (Map.Entry<String, Integer> filaMap : nombresEdades.entrySet()) {
            String key = filaMap.getKey();
            Integer val = filaMap.getValue();
            System.out.println("Key: " + key + "-- value: " + val);
            
        }
        
        System.out.println("conjunto de claves unicas ---------");
        for (String key : nombresEdades.keySet()) {
            System.out.println(key);
        }
        
        System.out.println("coleccion de edades unicas ----------");
        Collection<Integer> coleccionEdades = nombresEdades.values();
        for (Integer edad : coleccionEdades) {
            System.out.println(edad);
        }
        
        List<Integer> listaEdades = new ArrayList<>(nombresEdades.values());
        
    }
    
}
