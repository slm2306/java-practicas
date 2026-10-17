package com.sebas;

import java.util.ArrayList;

public class Inventario {

    private  ArrayList<Producto> productos;


    public Inventario() {
        productos = new ArrayList<>();
    }

    // CREAR UNA VERIFICACION QUE NO PERMITA AGREGAR EL PRODCUTO SI YA EXISTE
    public  void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public  void listarProductos(){
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles");
        }
        for (Producto p :productos){
            System.out.println("El producto "+p.getNombre()+" tiene un valor por unidad de $"+p.getPrecio()+" y hay "+p.getStock()+" unidad(es) disponibles");
        }

    }

    public  Producto buscarPorNombre(String nombre){
        for (Producto p : productos){
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                //ARREGLAR EL MENSAJE NOMBRE: ----- STOCK: ------ PRECIO: -----
                System.out.println("Si se encuentra el producto buscado por nombre y los detalles son: \n"+p.getNombre()+" "+p.getStock()+" "+p.getPrecio());
                return p;
            }
        }
        return  null;
    }
}
