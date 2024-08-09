/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aniobisiesto;

import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un año
        System.out.print("Por favor, ingresa un año: ");
        int anio = scanner.nextInt();

        // Verificar si el año es bisiesto
        boolean esBisiesto = false;

        if (anio % 4 == 0) {
            if (anio % 100 != 0 || anio % 400 == 0) {
                esBisiesto = true;
            }
        }

        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
