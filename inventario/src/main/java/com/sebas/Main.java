package com.sebas;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Producto p = new Producto("Arroz", 20000, 5);

    ArrayList<Producto> productos = new ArrayList<>();
    productos.add(p);

    for (Producto x : productos){
        System.out.println("La lista de productos es: \n- "+x.getNombre());
    }
    }
}