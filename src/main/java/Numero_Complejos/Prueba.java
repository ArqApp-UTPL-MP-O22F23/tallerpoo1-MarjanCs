/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Numero_Complejos;

import java.util.Scanner;

/**
 *
 * @author Marjan Celi Salinas
 */
public class Prueba {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float NumeroReal;
        float NumeroImaginario;

        Complejos Ecuacion1;
        Complejos Ecuacion2;
        Complejos Solucion;

        System.out.println("Operacion de Numeros Complejos\n ");
        System.out.print("Ingresar el valor real de la Ecuacion 1\n  ");
        NumeroReal = input.nextFloat();
        System.out.print("Ingresar el valor imaginario de la Ecuacion 1\n ");
        NumeroImaginario = input.nextFloat();

        Ecuacion1 = new Complejos(NumeroReal, NumeroImaginario);

        System.out.print("Ingresar el valor real de la Ecuacion 2\n ");
        NumeroReal = input.nextFloat();
        System.out.print("Ingresar el valor imaginario de la Ecuacion 2\n  ");
        NumeroImaginario = input.nextFloat();

        Ecuacion2 = new Complejos(NumeroReal, NumeroImaginario);

        int eleccion = Menu();
        while (eleccion != 3) {
            switch (eleccion) {
                case 1:
                    Solucion = Ecuacion1.Sumas(Ecuacion2);
                    System.out.printf("a + b = %s\n",
                            Solucion.toFloatString());
                    break;
                case 2:
                    Solucion = Ecuacion1.Resta(Ecuacion2);
                    System.out.printf("a - b = %s\n",
                            Solucion.toFloatString());
                    break;
            }
            eleccion = Menu();
        }

    }

    private static int Menu() {
        Scanner input = new Scanner(System.in);
        System.out.print("Menu:");
        System.out.println("Opcion 1 : Suma");
        System.out.println("Opcion 2 : Resta");

        return input.nextInt();
    } 
        
    
}
