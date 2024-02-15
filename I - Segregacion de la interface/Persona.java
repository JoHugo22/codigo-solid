
package com.mycompany.maini;

public class Persona implements Trabajador, Nadador {
    public String nombre;
    
    public Persona(String nombre){
        this.nombre=nombre;
    
    }
    @Override
    public void trabajar() {
        // Implementación de trabajar
        System.out.println("Esta Trabajando");
    }

    @Override
    public void nadar() {
        // Implementación de nadar
        System.out.println("No esta nadando");
    }
}
