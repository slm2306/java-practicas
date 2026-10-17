package com.sebas;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        // CREAR PRODUCTO
        Producto p1 = new Producto("Arroz", 20000, 5);
        Producto p2 = new Producto("Lentejas", 12000, 7);
        Producto p3 = new Producto("Mango", 2000, 3);

        //CREAR LISTA PRODUCTOS
        ArrayList<Producto> productos = new ArrayList<>();

        // AGREGAR PRODUCTO A LA LISTA DE PRODUCTOS
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);

        // IMPRIMIR LA LISTA DE PRODUCTOS
        System.out.println("La lista de productos es: ");
        for (Producto x : productos){
            System.out.println("- "+x.getNombre());
        }

        // LLAMAR EL METODO VENDER INGRESANDO LA CANTIDAD DE PRODUCTOS PARA VENDER
        p1.vender(2);

        // MOSTRAR EL STOCK DEL PRODUCTO
        for (Producto x : productos){
            System.out.println("El producto: "+x.getNombre()+" tiene "+x.getStock()+ " unidad(es) en stock");
        }

        // LLAMAR EL METODO VENDER INGRESANDO LA CANTIDAD DE PRODUCTOS PARA VENDER
        p1.reponer(20);
        for (Producto x : productos) {
            System.out.println("El nuevo stock del producto " + x.getNombre() + " es "+ x.getStock());
        }

        // CREAR EL INVENTARIO
        Inventario inventario = new Inventario();



        // AGREGAR PRODUCTOS AL INVENTARIO
        inventario.agregarProducto(p1);
        System.out.println("El producto "+p1.getNombre()+" ha sido agregado al inventario");
        inventario.agregarProducto(p2);
        System.out.println("El producto "+p2.getNombre()+" ha sido agregado al inventario");
        inventario.agregarProducto(p3);
        System.out.println("El producto "+p3.getNombre()+" ha sido agregado al inventario");

        // Mostrar los productos en el inventario
        System.out.println("El inventario cuenta con: ");
        inventario.listarProductos();

        //Buscar un producto por nombre

        inventario.buscarPorNombre("Arroz");

        inventario.buscarPorNombre("Arepa");




    }
}