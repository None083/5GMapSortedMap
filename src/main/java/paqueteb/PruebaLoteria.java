/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteb;

import java.util.Scanner;

/**
 *
 * @author FX506
 */
public class PruebaLoteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Loteria loteria = new Loteria();
        
        loteria.imprimirResultados();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el número de tu boleto");
        String boleto = teclado.nextLine();
        System.out.println("Tu premio es: " + loteria.mirarPremio(boleto));
        
    }
    
}
