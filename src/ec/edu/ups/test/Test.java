/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioConDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaTelefono;
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
        VistaTelefono vistaTelefono = new VistaTelefono();
        TelefonoDAO telefonoDAO = new TelefonoDAO();
        UsuarioConDAO usuarioConDAO = new UsuarioConDAO();
        ControladorUsuario control = new ControladorUsuario(vista, vistaTelefono, telefonoDAO, usuarioConDAO);
        TelefonoDAO te = new TelefonoDAO();
        ControladorTelefono controla = new ControladorTelefono(vistaTelefono,te);

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

                    boolean m2 = true;
                    System.out.println("*******inicio de sesion******");
                    System.out.println("Ingrese su correo electronico");
                    String correo = escribir.next();
                    System.out.println("Ingrese la contraseña");
                    String contraseña = escribir.next();
                    control.comprobarUsuario(correo, contraseña);
                    
                    while (m2) {
                         System.out.println("[1]Registrar teléfono");
                        System.out.println("[2]Modificar informacion");
                        System.out.println("[3]Eliminar teléfono");
                        System.out.println("[4]Buscar teléfono ");
                        System.out.println("[5]Listar teléfono");
                        System.out.println("[6]Menu principal");
                        System.out.print("\n" + "Ingrese la opción: ");
                        opc = escribir.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Registrar teléfono");
                                controla.registrar();
                                control.agregarTelefono();
                                break;
                            case 2:
                                System.out.println("Modificar informacion");
                                controla.actualizar();
                                break;
                            case 3:
                                System.out.println("Eliminar teléfono");
                                controla.eliminar();
                                break;
                            case 4:
                                System.out.println("Buscar teléfono ");
                                controla.verTelefono();
                                break;
                            case 5:
                                System.out.println("Listar teléfono");    
                                break;
                            default:
                                m2 = false;
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Crear cuenta");
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
