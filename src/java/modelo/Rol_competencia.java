/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ariel
 */
public class Rol_competencia {
    private int id_rol_comp;
    private Competencia competencia;
    private Rol rol;

    public Rol_competencia() {
    }

    public Rol_competencia(int id_rol_comp, Competencia competencia, Rol rol) {
        this.id_rol_comp = id_rol_comp;
        this.competencia = competencia;
        this.rol = rol;
    }

    public int getId_rol_comp() {
        return id_rol_comp;
    }

    public void setId_rol_comp(int id_rol_comp) {
        this.id_rol_comp = id_rol_comp;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Rol_competencia{" + "id_rol_comp=" + id_rol_comp + ", competencia=" + competencia + ", rol=" + rol + '}';
    }
    
    
}
