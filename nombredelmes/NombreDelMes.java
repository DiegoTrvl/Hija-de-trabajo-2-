/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nombredelmes;

import java.util.Scanner;

public class NombreDelMes {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número del mes
        System.out.print("Por favor, ingresa el numero del mes (1-12): ");
        int numeroMes = scanner.nextInt();

        // Array con los nombres de los meses
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        // Verificar si el número del mes es válido
        if (numeroMes >= 1 && numeroMes <= 12) {
            // Mostrar el nombre del mes correspondiente
            System.out.println("El mes es: " + nombresMeses[numeroMes - 1]);
        } else {
            // Mostrar un mensaje de error si el número del mes no es válido
            System.out.println("Numero de mes invalido. Por favor, ingresa un numero entre 1 y 12.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
