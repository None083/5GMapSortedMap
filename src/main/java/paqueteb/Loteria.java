/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author FX506
 * 
 * PARTE B
 * Implementa en una estructura de tipo map un sistema de almacenamiento 
 * de números de décimos de lotería nacional y su premio asociado.
 * Inserta en la estructura 1000 registros, inventando los números de los décimos 
 * y el premio asociado.
 * Ten en cuenta que el número de décimo debe contemplar ceros a la izquierda (09876, 00234, ...).
 *
 * La aplicación debe ofrecer al usuario la posibilidad de consultar por número 
 * de décimo el premio obtenido.
 * 
 */
public class Loteria {
    
    private Map<String, String> loteria;

    public Loteria() {
        this.loteria = new HashMap<>();
        
        for (int i = 0; i < 1000; i++) {
            String aux = RandomStringUtils.randomNumeric(5);
            this.loteria.put(aux, Premios.values()[new Random().nextInt(0, 4)].getPremio());
        }
    }

    public void imprimirResultados(){
//        String[] listaKeys = (String[]) this.loteria.keySet().toArray();
//        for (int i = 0; i < listaKeys.length; i++) {
//            System.out.println(listaKeys[i] + "-->" + loteria.get(listaKeys[i]));
//        }
//        System.out.print(this.loteria.entrySet());

        for (Map.Entry<String, String> entrada : loteria.entrySet()) {
            String key = entrada.getKey();
            String val = entrada.getValue();
            System.out.println("Key: " + key + " -- value: " + val);
        }
    }
    
    public String mirarPremio(String key){
         
        if(loteria.get(key) == null){
            return "No tiene premio";
        }
        
        return loteria.get(key);
    }
    
}
