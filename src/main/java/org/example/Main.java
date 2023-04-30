package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja <String> micaja = new Caja<>(new String[10]);
        micaja.add(0, "Hola");
        micaja.add(1, "Adios");
        micaja.add(2, "Hi");
        System.out.println(micaja);
        String temp = micaja.get(0);

        System.out.println("----------");
        CajaSinGenericos cajasin = new CajaSinGenericos(new Object[10]);
        cajasin.add(0, "Hola");
        cajasin.add(1, "Adios");
        cajasin.add(2, "Hiii");
        System.out.println(cajasin);
        String temp2 = (String) cajasin.get(0);

        System.out.println("-----COMIDA-----");

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yogurth", true));
        System.out.println(cajaComida.get(0));

        System.out.println("----------");
        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Manazana", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(11));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria", false));
        comidas2.add(new Comida("Yogurth", true));
        comidas2.add(new Comida("Danonino", false));
        comidas2.add(new Comida("Manzana", false));
        comidas2.add(new Comida("Bisteck", false));

        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("Fresa", false));
        comidas2.add(3, new Comida("Naranja", false));
        System.out.println("----FINAL----");
        for (Comida comida : comidas2) {
            System.out.println(comida);
        }



    }
}