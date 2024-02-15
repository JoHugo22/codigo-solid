

package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        Empleado persona =new Empleado("Madisson",1500);
        calculadoraimpuestos salario=new calculadoraimpuestos();
        
        System.out.println("Mi nombre es:");
        System.out.println(persona.nombre);
        System.out.println("Mi salario de programadora es:");
        System.out.println(persona.salario+" dolares");
        System.out.println("Mis impuestos a pagar son");
        System.out.println(salario.calcularImpuesto(persona)+" Dolares");

    }
}
