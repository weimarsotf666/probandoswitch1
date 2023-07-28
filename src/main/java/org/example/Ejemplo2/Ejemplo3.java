package org.example.Ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Digita la temperatura acatual: ");
        Double temperaturaAmbiente= teclado.nextDouble();
        String temperaturaComoTexto=temperaturaAmbiente.toString();

        switch (temperaturaComoTexto) {

            case "20":
                temperaturaAmbiente=25.0;
                break;

            case "30":
                temperaturaAmbiente=20.0;
                break;

            case" 40":
                temperaturaAmbiente=20.0;
                System.out.println("se esta muriendo perro");
                break;

            default:
                System.out.println("Digite la temperatura que desea");
                temperaturaAmbiente=teclado.nextDouble();

        }


    }
}
