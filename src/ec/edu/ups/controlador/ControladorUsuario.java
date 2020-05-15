/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.UsuarioConDAO;
import ec.edu.ups.idao.ITelefono;
import ec.edu.ups.idao.IUsuario;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;

/**
 *
 * @author HI andres
 */
public class ControladorUsuario {

    private VistaUsuario vistaUsuario;
    private VistaTelefono vistaTelefono;
    private Usuario usuario;
    private Telefono telefono;
    private ITelefono telefonoDAO;
    private IUsuario usuarioConDAO;

    public ControladorUsuario(VistaUsuario vistaUsuario, VistaTelefono vistaTelefono, ITelefono telefonoDAO, IUsuario usuarioConDAO) {
        this.vistaUsuario = vistaUsuario;
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = telefonoDAO;
        this.usuarioConDAO = usuarioConDAO;
    }

    

    public void registrar() {
        usuario = vistaUsuario.crearUsuario();
        usuarioConDAO.create(usuario);
    }
    public void actualizarUsuario(){
    usuario=vistaUsuario.actualizarUsuario();
    usuarioConDAO.update(usuario);
    }
    
    public void eliminarUsuario(){
    usuario=vistaUsuario.eliminarUsuario();
    usuarioConDAO.delete(usuario);
    }
     public void agregarTelefono(){
    int codigo = vistaTelefono.buscarTelefono();
    telefono = telefonoDAO.read(codigo);
    usuario.agregarTelefono(telefono);
    usuarioConDAO.update(usuario);
    }
     public void  verUsuario(){
   String cedula = vistaUsuario.buscarUsuario();
   usuario= usuarioConDAO.read(cedula);
   vistaUsuario.verUsuario(usuario);
   }
     public void listarTelefonos(String cedula) {
        usuario = usuarioConDAO.read(cedula);
        System.out.println(usuario.listarTelefonos());
    }

   

}
