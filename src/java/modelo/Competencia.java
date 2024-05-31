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
public class Competencia {
 private int id_competencia;
 private String nombre;
 private String descripcion;
 private ArrayList<Rol_competencia> rol_comp;

    public Competencia() {
    }

    public Competencia(int id_competencia, String nombre, String descripcion) {
        this.id_competencia = id_competencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_competencia() {
        return id_competencia;
    }

    public void setId_competencia(int id_competencia) {
        this.id_competencia = id_competencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Rol_competencia> getRol_comp() {
        return rol_comp;
    }

    public void setRol_comp(ArrayList<Rol_competencia> rol_comp) {
        this.rol_comp = rol_comp;
    }

    @Override
    public String toString() {
        return "Competencia{" + "id_competencia=" + id_competencia + ", nombre=" + nombre + ", descripcion=" + descripcion + ", rol_comp=" + rol_comp + '}';
    }
    
 
 
}
