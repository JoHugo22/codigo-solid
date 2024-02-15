
package com.mycompany.maino;

public class CalculadordeAreas {
    public double calcularAreaTotal(Forma[] formas) {
        double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }  
}
