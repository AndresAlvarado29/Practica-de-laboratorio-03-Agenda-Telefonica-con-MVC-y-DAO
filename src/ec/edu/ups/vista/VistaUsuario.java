/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Usuario;
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
}
