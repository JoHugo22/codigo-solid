
package com.mycompany.maino;

public class MainO {
    public static void main(String[] args) {
        Rectangulo primer=new Rectangulo(15,8);
        System.out.println("El area del rectangulo es:");
        System.out.println(primer.calcularArea());
        Circulo primerr=new Circulo(8);
        System.out.println("El area del circulo es:");
        System.out.println(primerr.calcularArea());
        System.out.println("El area del cuadrado es:");
        Cuadrado uno=new Cuadrado(15);
        System.out.println(uno.calcularArea());

        
    }
}
