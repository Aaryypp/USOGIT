
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Usuario {
    
    private int id_usuario;
    private Persona persona;
    private String user;
    private String password;
    private ArrayList<Usuario_Rol> usuario_rol;

    public Usuario(int id_usuario, Persona persona, String user, String password) {
        this.id_usuario = id_usuario;
        this.persona = persona;
        this.user = user;
        this.password = password;
    }

    public Usuario() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Usuario_Rol> getUsuario_rol() {
        return usuario_rol;
    }

    public void setUsuario_rol(ArrayList<Usuario_Rol> usuario_rol) {
        this.usuario_rol = usuario_rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", persona=" + persona + ", user=" + user + ", password=" + password + ", usuario_rol=" + usuario_rol + '}';
    }

    
    
    
}
