/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edadusuario;

import java.util.Scanner;

public class EdadUsuario {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su edad
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Verificar si el usuario es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
