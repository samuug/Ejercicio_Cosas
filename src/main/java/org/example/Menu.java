package org.example;

import java.util.Scanner;

public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public static double x;
    public static double y;
    public static void menu(){
        Funcion funcion = new Funcion();
        boolean salir = false;
        do {
            System.out.println("Menú");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opción: ");
            switch (scanner.nextInt()){
                case 1:
                    setX(x);
                    setY(y);
                    System.out.println(funcion.calcularPotencia(getX(), getY()));
                    break;
                case 2:
                    setX(x);
                    setY(y);
                    System.out.println(funcion.calcularPotencia2(getX(), getY()));
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!salir);
    }
    public static double getX() {
        return x;
    }

    public static void setX(double x) {
        System.out.println("Ingrese el valor de x: ");
        Menu.x = scanner.nextDouble();
    }

    public static double getY() {
        return y;
    }

    public static void setY(double y) {
        System.out.println("Ingrese el valor de y: ");
        Menu.y = scanner.nextDouble();
    }
}
