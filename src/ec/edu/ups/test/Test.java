/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.vista.VistaUsuario;
import java.util.Scanner;

/**
 *
 * @author HI andres
 */
public class Test {

    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);
        VistaUsuario vista = new VistaUsuario();
        ControladorUsuario control = new ControladorUsuario(vista);
        int opc;
        boolean m = true;
        while (m) {
            System.out.println("********Agenda Telefónica********");
            System.out.println("          ¡Bienvenido!         " + "\n");
            System.out.println("[1]Iniciar sesión" + "  " + "[2]Registrarse" + "\n");
            System.out.println("            [3]Salir");
            System.out.print("\n" + "Ingrese la opción: ");
            opc = escribir.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese su correo electronico"+"\n");
                    String correo = escribir.next();
                    System.out.println("Ingrese la contraseña");
                    String contraseña = escribir.next();
                    break;
                case 2:
                    vista.crearUsuario();
                    control.registrar();
                    break;
                default:
                    System.out.println("Ha terminado");
                    m = false;
                    break;
            }
        }
    }

}
