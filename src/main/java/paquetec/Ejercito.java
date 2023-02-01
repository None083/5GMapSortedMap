/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author FX506
 */
public class Ejercito {

    private Set<Soldado> ejercito;

    public Ejercito() {
        ejercito = new HashSet<>();
    }

    public int numeroSoldados() {
        return ejercito.size();
    }

    public void alistarSoldado(Soldado s) {
        ejercito.add(s);
    }

    public boolean estaVacio() {
        return ejercito.isEmpty();
    }

    public boolean estaEnEjercito(Soldado s) {
        return ejercito.contains(s);
    }

    public ArrayList<Soldado> listaSoldados() {
        return new ArrayList<>(ejercito);
    }

    public void desmatricularSoldado(Soldado s) {
        ejercito.remove(s);
    }

    public void mostrarEjercito1() {
        // internamente está usando un objeto de tipo iterator
        for (Soldado s : ejercito) {
            System.out.println(s);
        }
    }

        //me permite recorrer colecciones
    public void mostrarEjercito2() {
        Iterator<Soldado> iterador = ejercito.iterator();
        Soldado aux;

        while (iterador.hasNext()) {
            aux = iterador.next();
            System.out.println(aux);
        }
    }

}
