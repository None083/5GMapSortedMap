/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.Objects;

/**
 *
 * @author noelia
 */
public class Traductor {
    
    private String palabra;
    private String traduccion;

    public Traductor(String palabra, String traduccion) {
        this.palabra = palabra;
        this.traduccion = traduccion;
    }

    public Traductor() {
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.palabra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Traductor other = (Traductor) obj;
        return Objects.equals(this.palabra, other.palabra);
    }

    @Override
    public String toString() {
        return "Traductor{" + "palabra=" + palabra + ", traduccion=" + traduccion + '}';
    }
    
    
    
}
