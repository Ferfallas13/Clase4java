package com.mycompany.clase_4;

import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero = Math.random() * 10;
        int num = (int) numero;

        int i = 0;
        System.out.println("Bienvenidos al juego ingrese el numero");
        int valor;
        do {
            System.out.println("Intoduzca un valor");
            valor = entrada.nextInt();
            if (valor > num) {
                System.out.println("No es correcto, te has pasado ");
                System.out.println("------------------------------");
            }
            if (valor < num) {
                System.out.println("No es correcto, te has quedado corto");
                System.out.println("------------------------------------");
            }
            i++;
        } while (valor != num);
        System.out.println("-----------------------------------------");
        System.out.println("Exelente correcto el numero es " + numero);
        System.out.println("Has necesitado " + i + " de intentos");
    }
}