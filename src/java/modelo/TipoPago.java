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
public class TipoPago {
    private int id_tipo_pago;
    private String tipo;
    private String descrip;
    private ArrayList<Factura> factura;

    public TipoPago() {
    }
    

    public TipoPago(int id_tipo_pago, String tipo, String descrip) {
        this.id_tipo_pago = id_tipo_pago;
        this.tipo = tipo;
        this.descrip = descrip;
    }

    public int getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(int id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public ArrayList<Factura> getFactura() {
        return factura;
    }

    public void setFactura(ArrayList<Factura> factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "TipoPago{" + "id_tipo_pago=" + id_tipo_pago + ", tipo=" + tipo + ", descrip=" + descrip + ", factura=" + factura + '}';
    }

   
    
}
