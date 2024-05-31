/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Producto {
      private int id_producto;
      private int stock;
      private double precio_unitario;
      private String unidad;
      private Clasificacion clasificacion;
      private Proveedores proveedor;
      private boolean iva;
      private ArrayList<Item_factura> itemsfact;

    public Producto() {
    }

    public Producto(int id_producto, int stock, double precio_unitario, String unidad, Clasificacion clasificacion, Proveedores proveedor, boolean iva) {
        this.id_producto = id_producto;
        this.stock = stock;
        this.precio_unitario = precio_unitario;
        this.unidad = unidad;
        this.clasificacion = clasificacion;
        this.proveedor = proveedor;
        this.iva = iva;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Proveedores getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    public ArrayList<Item_factura> getItemsfact() {
        return itemsfact;
    }

    public void setItemsfact(ArrayList<Item_factura> itemsfact) {
        this.itemsfact = itemsfact;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", stock=" + stock + ", precio_unitario=" + precio_unitario + ", unidad=" + unidad + ", clasificacion=" + clasificacion + ", proveedor=" + proveedor + ", iva=" + iva + ", itemsfact=" + itemsfact + '}';
    }

   
      
      
    
}
