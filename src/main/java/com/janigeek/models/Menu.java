package com.janigeek.models;

public class Menu {
    public String menu = """
            \n
                    *******************************
                    Ingresa la operacion a convertir:
                    1 - Dolar a Peso Mexicano
                    2 - Dolar a Dírham EAU
                    3 - Dolar a Soles Peruanos
                    4 - Dolar a Moneda Brasileña
                    5 - Dolar a Euros
                    6 - Dolr a Dolar Canadiense
                    7 - Salir
                    *******************************
                    """;

    // Sobreescribir el metodo toString para mostrar datos
    @Override
    public String toString() {
        return menu;
    }
}
