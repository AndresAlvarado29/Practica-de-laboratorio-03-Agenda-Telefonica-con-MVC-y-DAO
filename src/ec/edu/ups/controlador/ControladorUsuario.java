/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.UsuarioDao;
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
    private IUsuario usuarioDao;

    public ControladorUsuario(VistaUsuario vistaUsuario) {
        this.vistaUsuario = vistaUsuario;
        this.usuarioDao = new UsuarioDao();
    }

    public void registrar() {
        usuario = vistaUsuario.crearUsuario();
        usuarioDao.create(usuario);
    }

    public void comprobarUsuario(String correo, String contraseña) {

        if (usuario != null) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)) {
                System.out.println("Inicio Satisfactorio");

            } else {
                System.out.println("correo o contraseña incorrecto ");
            }
        } else if (usuario == null) {
            System.out.println("No exise");

        }

    }

}
