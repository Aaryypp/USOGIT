/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ariel
 */
public class Factura {
    private int id_factura;
    private String ruc;
    private Persona persona;
    private Date fecha=new Date();
    private TipoPago tipopago;
    private double descuento;
    private double total;
    private ArrayList<Item_factura> items;

    public Factura() {
    }

    public Factura(int id_factura, String ruc, Persona persona, TipoPago tipopago, double descuento, double total) {
        this.id_factura = id_factura;
        this.ruc = ruc;
        this.persona = persona;
        this.tipopago = tipopago;
        this.descuento = descuento;
        this.total = total;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoPago getTipopago() {
        return tipopago;
    }

    public void setTipopago(TipoPago tipopago) {
        this.tipopago = tipopago;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Item_factura> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item_factura> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Factura{" + "id_factura=" + id_factura + ", ruc=" + ruc + ", persona=" + persona + ", fecha=" + fecha + ", tipopago=" + tipopago + ", descuento=" + descuento + ", total=" + total + ", items=" + items + '}';
    }
    
    
    
    
}
