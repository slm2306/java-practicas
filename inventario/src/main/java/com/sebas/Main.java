package com.sebas;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        // CREAR PRODUCTO
        Producto p = new Producto("Arroz", 20000, 5);

        //CREAR LISTA PRODUCTOS
        ArrayList<Producto> productos = new ArrayList<>();

        // AGREGAR PRODUCTO A LA LISTA DE PRODUCTOS
        productos.add(p);

        // IMPRIMIR LA LISTA DE PRODUCTOS
        System.out.println("La lista de productos es: ");
        for (Producto x : productos){
            System.out.println("- "+x.getNombre());
        }

        // LLAMAR EL METODO VENDER INGRESANDO LA CANTIDAD DE PRODUCTOS PARA VENDER
        p.vender(2);

        // MOSTRAR EL STOCK DEL PRODUCTO
        for (Producto x : productos){
            System.out.println("El producto: "+x.getNombre()+" tiene "+x.getStock()+ " unidad(es) en stock");
        }

    // LLAMAR EL METODO VENDER INGRESANDO LA CANTIDAD DE PRODUCTOS PARA VENDER
        p.reponer(20);
        for (Producto x : productos) {
            System.out.println("El nuevo stock del producto " + x.getNombre() + " es "+ x.getStock());
        }
    }
}