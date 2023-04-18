/*
 Escriba un programa que pida una frase o palabra y valide si la 
primera letra de esa frase es una ‘A’. Si la primera letra es una
‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
la función Substring y equals() de Java.
 */
package guia_3_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class ejercicio_4_validarPrimerLetra {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String frase;

        System.out.print("Ingrese una frase que comience con A");
        frase = Leer.next();

        if (frase.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}