
package com.mycompany.maino;

public class Cuadrado extends Rectangulo{
    public Cuadrado(double lado){
        super(lado,lado);
    }
    
    public void setLargo(double largo) {
        super.largo = largo;
        super.ancho = largo;
    }

    public void setAncho(double ancho) {
        super.ancho = ancho;
        super.largo = ancho;
    }
}
    

