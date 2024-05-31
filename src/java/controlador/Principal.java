/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Clasificacion;
import modelo.Competencia;
import modelo.Factura;
import modelo.Item_factura;
import modelo.Persona;
import modelo.Producto;
import modelo.Proveedores;
import modelo.Rol;
import modelo.Rol_competencia;
import modelo.TipoPago;
import modelo.Usuario;
import modelo.Usuario_Rol;
import sw.ConversionSW;
import sw.ConversionSW_Service;

/**
 *
 * @author ariel
 */
public class Principal {
    
public static ArrayList<Persona> listapers;
public static ArrayList<TipoPago> listapagos;
public static ArrayList<Competencia> listacompetencia;
public static ArrayList<Clasificacion> listaclasific;
public static ArrayList<Producto> listaproduc;
public static ArrayList<Proveedores> listaproveedor;
public static ArrayList<Factura> listafact;
public static ArrayList<Item_factura> listaitems;
public  static ArrayList<Usuario> listausuario;
public static ArrayList<Rol_competencia> listadorolcomp;
public static ArrayList<Rol> listadorol;
public static ArrayList<Usuario_Rol> listausuariorol;  
public static void crearDatos(){
        ///PERSONAS
        listapers=new  ArrayList();
        listapers.add(new Persona(1, "Ariel", "Guaman", "0107940033", "0967940744", "arielguaman@gmail.com",null,null));
        listapers.add(new Persona(2, "Elena", "Gómez", "0123456789", "0999123456", "elena.gomez@example.com",null,null));
        listapers.add(new Persona(3, "Carlos", "Hernández", "0987654321", "0999887766", "carlos.hernandez@example.com",null,null));
        listapers.add(new Persona(4, "Sofía", "Martínez", "0934567890", "0987654321", "sofia.martinez@example.com",null,null));
        listapers.add(new Persona(5, "David", "López", "0876543210", "0976543210", "david.lopez@example.com",null,null));
        listapers.add(new Persona(6, "Ana", "Fernández", "0865479123", "0923456789", "ana.fernandez@example.com",null,null));      
    
       
        ///tipos de pagos
        listapagos=new  ArrayList(); 
        listapagos.add(new TipoPago(1, "Efectivo", "Dinero en efectivo "));
        listapagos.add(new TipoPago(2, "Tarjeta de crédito", "Pago mediante tarjeta de crédito"));
        listapagos.add(new TipoPago(3, "Transferencia bancaria", "Transferencia de fondos entre cuentas bancarias"));
        listapagos.add(new TipoPago(4, "Cheque", "Pago mediante un cheque emitido por el pagador"));
       

        
        ////clasificacion
        listaclasific=new  ArrayList(); 
        listaclasific.add(new Clasificacion(1, "Electrónica"));
        listaclasific.add(new Clasificacion(2, "Ropa"));
        listaclasific.add(new Clasificacion(3, "Alimentos"));
        listaclasific.add(new Clasificacion(4, "Hogar"));
        listaclasific.add(new Clasificacion(5, "Juguetes"));
        listaclasific.add(new Clasificacion(6, "Libros"));
        listaclasific.add(new Clasificacion(7, "Belleza"));
        listaclasific.add(new Clasificacion(8, "Deportes"));
        
        ////proveedor
        listaproveedor=new  ArrayList(); 
        listaproveedor.add(new Proveedores(1, "123456789", "0987654321", "Ecuador", "proveedor1@example.com", "ROBUX"));
        listaproveedor.add(new Proveedores(2, "987654321", "0987654322", "Estados Unidos", "proveedor2@example.com", "MINECOINS"));
        listaproveedor.add(new Proveedores(3, "654321987", "0987654323", "España", "proveedor3@example.com", "GROSCHEN"));
        listaproveedor.add(new Proveedores(4, "111222333", "0987654324", "México", "proveedor4@example.com", "MONONAS DE PLATA"));
        listaproveedor.add(new Proveedores(5, "444555666", "0987654325", "Argentina", "proveedor5@example.com", "DENARIOS"));
       
        ///PRODUCTO
        listaproduc=new  ArrayList(); 
        listaproduc.add(new Producto(1, 50, 1200, "aifon13", (Clasificacion)listaclasific.get(0), (Proveedores)listaproveedor.get(0), true));
        listaproduc.add(new Producto(2, 38, 980, "samsuns24", (Clasificacion)listaclasific.get(0), (Proveedores)listaproveedor.get(1), true));
        listaproduc.add(new Producto(3, 2, 30, "Xiomi 15 ultra", (Clasificacion)listaclasific.get(5), (Proveedores)listaproveedor.get(2), true));
        listaproduc.add(new Producto(4, 45, 30, "Luna de pluton", (Clasificacion)listaclasific.get(5), (Proveedores)listaproveedor.get(3), true));
        listaproduc.add(new Producto(5, 3, 30, "Milucha", (Clasificacion)listaclasific.get(5), (Proveedores)listaproveedor.get(4), true));
         
        ///FACTURA
        listafact=new ArrayList();
        listafact.add(new Factura(1,"0104994785001", (Persona)listapers.get(0),(TipoPago)listapagos.get(0), 10, 250));
        listafact.add(new Factura(2,"0123456789001", (Persona)listapers.get(0),(TipoPago)listapagos.get(0), 15, 3500));
        listafact.add(new Factura(2,"0987654321001", (Persona)listapers.get(0),(TipoPago)listapagos.get(0), 30, 4800));
         
        
        ////SE AÑADE LAS LISTA DE FACTURAS A LA PERSONA 0 
        //listapers.get(0).setFacturas(listafact);
  
        

        ////ITEMFACT
        listaitems=new ArrayList();
        listaitems.add(new Item_factura(1, (Factura)listafact.get(0), (Producto)listaproduc.get(0), 1, 1200, 1200));
        listaitems.add(new Item_factura(2, (Factura)listafact.get(0), (Producto)listaproduc.get(1), 2, 5000, 10000));
        listaitems.add(new Item_factura(3, (Factura)listafact.get(0), (Producto)listaproduc.get(2), 2, 6000, 12000)); 
 
        listaitems.add(new Item_factura(4, (Factura)listafact.get(1), (Producto)listaproduc.get(0), 1, 1200, 1200));
        listaitems.add(new Item_factura(5, (Factura)listafact.get(1), (Producto)listaproduc.get(2), 2, 60000, 12000));
        listaitems.add(new Item_factura(6, (Factura)listafact.get(1), (Producto)listaproduc.get(3), 2, 8000, 16000)); 
        
        listaitems.add(new Item_factura(7, (Factura)listafact.get(2), (Producto)listaproduc.get(1), 1, 1200, 1200));
        listaitems.add(new Item_factura(8, (Factura)listafact.get(2), (Producto)listaproduc.get(2), 2, 450, 2000));
        listaitems.add(new Item_factura(9, (Factura)listafact.get(2), (Producto)listaproduc.get(3), 2, 6000, 15000));
        
     
               ////rol
        listadorol=new ArrayList();  
        listadorol.add(new Rol(0, "jefe", true));
        listadorol.add(new Rol(1, "cliente", true));
        listadorol.add(new Rol(2, "empleado", true));
        
                ///competencia
        listacompetencia=new  ArrayList(); 
        listacompetencia.add(new Competencia(1, "Administrar Usuarios", "Permite administrar usuarios del sistema"));
        listacompetencia.add(new Competencia(2, "Gestionar Contenidos", "Permite gestionar contenidos del sistema"));
        listacompetencia.add(new Competencia(3, "Generar Reportes", "Permite generar reportes y análisis de datos"));
        
        ////ROLCOMPETENCIA
        listadorolcomp=new ArrayList();
                                         ////jefe
        listadorolcomp.add(new Rol_competencia(1, (Competencia)listacompetencia.get(0), (Rol)listadorol.get(0)));
        listadorolcomp.add(new Rol_competencia(2, (Competencia)listacompetencia.get(1), (Rol)listadorol.get(0)));
        listadorolcomp.add(new Rol_competencia(3, (Competencia)listacompetencia.get(2), (Rol)listadorol.get(0)));
                                        ///empleado
        listadorolcomp.add(new Rol_competencia(4, (Competencia)listacompetencia.get(1), (Rol)listadorol.get(2)));
        listadorolcomp.add(new Rol_competencia(5, (Competencia)listacompetencia.get(2), (Rol)listadorol.get(2)));
        
        
        
        ////USUARIO
        listausuario=new ArrayList();
        listausuario.add(new Usuario(1, (Persona)listapers.get(0), "Elcrackman", "1234"));
        listausuario.add(new Usuario(2, (Persona)listapers.get(0), "Elrichmc", "1234"));
        listausuario.add(new Usuario(3, (Persona)listapers.get(2), "donbestia", "1234"));
        
        ////USUARIO ROL
        listausuariorol=new ArrayList();
        listausuariorol.add(new Usuario_Rol(1,(Usuario)listausuario.get(0), (Rol)listadorol.get(0)));
        listausuariorol.add(new Usuario_Rol(2,(Usuario)listausuario.get(0), (Rol)listadorol.get(1)));
        listausuariorol.add(new Usuario_Rol(3,(Usuario)listausuario.get(0), (Rol)listadorol.get(2)));
        listausuariorol.add(new Usuario_Rol(3,(Usuario)listausuario.get(1), (Rol)listadorol.get(2)));
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    crearDatos();
    System.out.print("Ingrese una cédula: ");
    String cedula = scanner.nextLine();
    boolean personaEncontrada = false;

    // Buscar persona por cpersonaEncontradaédula e imprimir detalles si se encuentra
    for (Object obj : listapers) {
        if (obj instanceof Persona) {
            Persona persona = (Persona) obj;
            if (persona.getDni().equals(cedula)) {
                System.out.println("Persona encontrada:");
                System.out.println(persona.toString());
                personaEncontrada = true;

                // Imprimir facturas asociadas a la persona
                System.out.println("\nFacturas asociadas a la persona:");
                for (Object facturaObj : listafact) {
                    if (facturaObj instanceof Factura) {
                        Factura factura = (Factura) facturaObj;
                        if (factura.getPersona().getDni().equals(cedula)) {
                            System.out.println(factura.toString());
                        }
                    }
                }
                System.out.println();

                // Imprimir usuarios asociados a la persona
                System.out.println("\nUsuarios asociados a la persona:");
                for (Object usuarioObj : listausuario) {
                    if (usuarioObj instanceof Usuario) {
                        Usuario usuario = (Usuario) usuarioObj;
                        if (usuario.getPersona().getDni().equals(cedula)) {
                            System.out.println(usuario.toString());

                            // Imprimir roles asociados al usuario
                            for (Object rolObj : listausuariorol) {
                                if (rolObj instanceof Usuario_Rol) {
                                    Usuario_Rol usuRol = (Usuario_Rol) rolObj;
                                    if (usuRol.getUsuario().getId_usuario() == usuario.getId_usuario()) {
                                        Rol rol = usuRol.getRol();
                                        System.out.println("Rol: " + rol.getRol());

                                        // Imprimir competencias asociadas al rol
                                        System.out.println("Competencias asociadas al rol:");
                                        for (Object compObj : listadorolcomp) {
                                            if (compObj instanceof Rol_competencia) {
                                                Rol_competencia rolComp = (Rol_competencia) compObj;
                                                if (rolComp.getRol().getId_rol() == rol.getId_rol()) {
                                                    Competencia competencia = rolComp.getCompetencia();
                                                    System.out.println("- " + competencia.getNombre());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            System.out.println();
                        }
                    }
                }
                break;
            }
        }
    }

    if (!personaEncontrada) {
        System.out.println("Persona no encontrada.");
    }
    
    
}


}
