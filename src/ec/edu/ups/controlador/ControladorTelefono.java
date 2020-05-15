/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITelefono;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import java.util.List;

/**
 *
 * @author HI andres
 */
public class ControladorTelefono {
    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private ITelefono telefonoDAO;

    public ControladorTelefono(VistaTelefono vistaTelefono, ITelefono telefonoDAO) {
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = telefonoDAO;
    }
   public void registrar(){
   telefono = vistaTelefono.ingresarTelefono();
   telefonoDAO.create(telefono);
   } 
   public void  verTelefono(){
   int codigo = vistaTelefono.buscarTelefono();
   telefono= telefonoDAO.read(codigo);
   vistaTelefono.verTelefono(telefono);
   }
   public void actualizar(){
   telefono = vistaTelefono.actualizarTelefono();
   telefonoDAO.update(telefono);
   vistaTelefono.verTelefono(telefono);
   }
   public void eliminar(){
   telefono = vistaTelefono.eliminarTelefono();
   telefonoDAO.delete(telefono);
   }
   public void verTelefonos(){
   List<Telefono> telefonos;
   telefonos = telefonoDAO.findAll();
   vistaTelefono.verTelefonos(telefonos);
   }
}
