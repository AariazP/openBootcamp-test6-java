package org.example;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(calcularPrecioIvaIncluido(100.0, 21.0));
    }


    public static Double calcularPrecioIvaIncluido(Double precioSinIva, Double iva)
    {
        return precioSinIva * (1 + iva / 100);
    }

}