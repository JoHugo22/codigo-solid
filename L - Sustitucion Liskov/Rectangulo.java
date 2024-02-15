
package com.mycompany.maino;

public class Rectangulo implements Forma {
    public double largo;
    public double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}