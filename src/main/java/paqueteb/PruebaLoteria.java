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

        Scanner teclado = new Scanner(System.in);
        Loteria loteria = new Loteria();

        int opcion = 0;

        do {

            System.out.println("""
                           -------------------------------------------
                                        ESCOJA UNA OPCION
                           -------------------------------------------
                                  0 - Salir
                                  1 - Mostrar números premiados
                                  2 - Consultar premio
                           -------------------------------------------
                           """);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    loteria.imprimirResultados();
                    break;
                case 2:
                    System.out.println("Introduce el número de tu boleto");
                    String boleto = teclado.nextLine();
                    System.out.println("Tu premio es: " + loteria.mirarPremio(boleto));
                    break;
                case 0:
                    System.out.println("Hasta luegui <3");
                    break;
                default:
                    System.out.println("Numero no válido");
                    break;
            }
            
        } while (opcion != 0);

    }

}
