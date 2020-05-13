/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.UsuarioConDAO;
import ec.edu.ups.idao.IUsuario;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaUsuario;

/**
 *
 * @author HI andres
 */
public class ControladorUsuario {

    private VistaUsuario vistaUsuario;
    private Usuario usuario;
    private IUsuario usuarioConDAO;

    public ControladorUsuario(VistaUsuario vistaUsuario) {
        this.vistaUsuario = vistaUsuario;
        this.usuarioConDAO = new UsuarioConDAO();
    }

    public void registrar() {
        usuario = vistaUsuario.crearUsuario();
        usuarioConDAO.create(usuario);
    }

    public void comprobarUsuario(String correo, String contraseña) {

        if (usuario != null) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)) {
                System.out.println("Inicio Satisfactorio");
 System.out.println("[1]Registrar teléfono");
                        System.out.println("[2]Modificar informacion");
                        System.out.println("[3]Eliminar teléfono");
                        System.out.println("[4]Buscar teléfono ");
                        System.out.println("[5]Listar teléfono");
                        System.out.println("[6]Menu principal");
                        System.out.print("\n" + "Ingrese la opción: ");
            } else {
                System.out.println("correo o contraseña incorrecto ");
            }
        } else if (usuario == null) {
            System.out.println("No exise");

        }

    }

}
