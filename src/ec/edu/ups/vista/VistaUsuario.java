/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Usuario;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HI andres
 */
public class VistaUsuario {
    private Scanner escribir;

    public VistaUsuario() {
  escribir = new Scanner (System.in);
    }
public Usuario crearUsuario(){
    System.out.println("Ingrese numero de cedula");
    String cedula =  escribir.next();
    System.out.println("Ingrese el nombre");
    String nombre = escribir.next();
    System.out.println("Ingrese el apellido");
    String apellido= escribir.next();
    System.out.println("Ingrese correo electronico");
    String correo = escribir.next();
    System.out.println("Ingrese una contraseña");
    String contraseña = escribir.next();
return new Usuario(cedula, nombre, apellido, correo, contraseña);
}
public Usuario actualizarUsuario(){
escribir = new Scanner(System.in);
    System.out.println("Ingrese la cedula del usuario que desea actualizar");
    String cedula = escribir.next();
    System.out.println("Ingrese los nuevos datos");
    System.out.println("Ingrese el nombre");
    String nombre = escribir.next();
    System.out.println("Ingrese el apellido");
    String apellido= escribir.next();
    System.out.println("Ingrese correo electronico");
    String correo = escribir.next();
    System.out.println("Ingrese una contraseña");
    String contraseña = escribir.next();
    return new Usuario(cedula, nombre, apellido, correo, contraseña);
}
public Usuario eliminarUsuario(){
escribir = new Scanner(System.in);
    System.out.println("Ingrese la cedula del usuario que desea eliminar");
    String cedula= escribir.next();
    return new Usuario(cedula, null, null, null, null);
}
public String buscarUsuario(){
  escribir = new Scanner(System.in);
      System.out.println("Ingresa la cedula del usuario");
      String cedula = escribir.next();
      return cedula;
  }

public void verUsuario(Usuario usuario){
    System.out.println("Datos del usuario:"+ usuario);
}
public void verUsuario(List<Usuario> usuarios){
    for (Usuario usuario : usuarios) {
       System.out.println("Datos del usuario:"+ usuario); 
    }
}
}
