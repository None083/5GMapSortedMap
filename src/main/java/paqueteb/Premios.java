/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package paqueteb;

/**
 *
 * @author FX506
 */
public enum Premios {
    
    A("1000€"), B("100€"), C("5€"), D("20€");
    
    private String premio;

    private Premios(String premio) {
        this.premio = premio;
    }

    public String getPremio() {
        return premio;
    }
    
    
    
}
