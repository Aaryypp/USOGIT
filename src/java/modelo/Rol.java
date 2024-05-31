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
public class Rol {
    private int id_rol;
    private String rol;
    private boolean estado;
    private ArrayList<Usuario_Rol> usu_rol;
    private ArrayList<Rol_competencia> rol_comp;
    

    public Rol() {
    }

    public Rol(int id_rol, String rol, boolean estado) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.estado = estado;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Usuario_Rol> getUsu_rol() {
        return usu_rol;
    }

    public void setUsu_rol(ArrayList<Usuario_Rol> usu_rol) {
        this.usu_rol = usu_rol;
    }

    public ArrayList<Rol_competencia> getRol_comp() {
        return rol_comp;
    }

    public void setRol_comp(ArrayList<Rol_competencia> rol_comp) {
        this.rol_comp = rol_comp;
    }

    @Override
    public String toString() {
        return "Rol{" + "id_rol=" + id_rol + ", rol=" + rol + ", estado=" + estado + ", usu_rol=" + usu_rol + ", rol_comp=" + rol_comp + '}';
    }
    
    
    
    
}
