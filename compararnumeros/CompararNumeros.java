/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compararnumeros;

import java.util.Scanner;

import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número entero
        System.out.print("Por favor, ingresa el primer numero entero: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número entero
        System.out.print("Por favor, ingresa el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        // Comparar los dos números y devolver el mayor
        if (numero1 > numero2) {
            System.out.println("El mayor numero es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El mayor nuero es: " + numero2);
        } else {
            System.out.println("Ambos numeros son iguales.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
