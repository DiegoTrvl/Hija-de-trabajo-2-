/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparartresnumeros;

import java.util.Scanner;

public class CompararTresNumeros {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número entero
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número entero
        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        // Pedir al usuario que ingrese el tercer número entero
        System.out.print("Ingrese el tercer numero entero: ");
        int numero3 = scanner.nextInt();

        // Comparar los números y determinar el mayor
        int mayor;
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        // Mostrar el mayor número en la pantalla
        System.out.println("El mayor numero es: " + mayor);
    }
}
