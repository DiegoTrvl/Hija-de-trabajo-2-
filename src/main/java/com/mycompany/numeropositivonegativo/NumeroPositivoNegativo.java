/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeropositivonegativo;

import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Por favor, ingresa un numero entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es positivo o negativo
        if (numero > 0) {
            System.out.println("El numero es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
