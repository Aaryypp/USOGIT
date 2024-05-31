/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ariel
 */
public class Usuario_Rol {
     private  int id_usu;
     private Usuario usuario;
     private Rol rol;

    public Usuario_Rol() {
    }

    public Usuario_Rol(int id_usu, Usuario usuario, Rol rol) {
        this.id_usu = id_usu;
        this.usuario = usuario;
        this.rol = rol;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario_Rol{" + "id_usu=" + id_usu + ", usuario=" + usuario + ", rol=" + rol + '}';
    }
     
    
}
