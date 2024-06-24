package com.janigeek;

import java.util.Scanner;

import com.janigeek.models.Menu;

import com.janigeek.models.Convertir;

public class App {
    public static void main(String[] args) throws Exception {
        int option = 0;
        Scanner read = new Scanner(System.in);
        // Llamar al menu
        Menu menu = new Menu();
        Convertir conversor = new Convertir();

        while (option != 7) {
            System.out.println(menu);
            // leer dato de entrada
            option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Un dolar es igual a ");
                    conversor.Convert("USD", "MXN");
                    System.out.println(" Pesos Mexicanos");
                    break;
                case 2:
                    System.out.println("Un dolar es igual a ");
                    conversor.Convert("USD", "AED");
                    System.out.println(" Dírham's");
                    break;
                case 3:
                    System.out.println("Un dolar es igual a ");
                    conversor.Convert("USD", "PEN");
                    System.out.println(" Soles Peruanos");
                    break;
                case 4:
                    System.out.println("Un dolar es igual a ");
                    conversor.Convert("USD", "BRL");
                    System.out.println(" Moneda Brasileña");
                    break;
                case 5:
                    System.out.println("Un dolar es igual a ");
                    conversor.Convert("USD", "EUR");
                    System.out.println(" Euros");
                    break;
                case 6:
                    System.out.println("Un dolar es igual a ");
                    conversor.Convert("USD", "CAD");
                    System.out.println(" Dolares Canadienses");
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }
        read.close();
    }
}
