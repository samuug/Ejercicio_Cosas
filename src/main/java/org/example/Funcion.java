package org.example;

public class Funcion {
    /*Escribir una función recursiva que calcule xy mediante multiplicaciones sucesivas, siendo x e y
    dos números enteros. ¿Cuál es el tipo de recursividad empleado?
     */
    public double calcularPotencia(double x, double y) {
        if (y == 0) {
            return 1;
        } else {
            return x * calcularPotencia(x, y - 1);
        }
    }

    public double calcularPotencia2(double x, double y) {
        if (y == 0) {
            return 1;
        } else {
            if (y % 2 == 0) {
                return calcularPotencia2(x * x, y / 2);
            } else {
                return x * calcularPotencia2(x * x, (y - 1) / 2);
            }
        }
    }

}
