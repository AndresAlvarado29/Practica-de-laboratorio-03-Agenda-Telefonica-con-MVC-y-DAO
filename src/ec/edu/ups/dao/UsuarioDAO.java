/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IUsuario;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author HI andres
 */
public class UsuarioDAO implements IUsuario{
private List<Usuario>listaUsuario;

    public UsuarioDAO() {
        listaUsuario = new ArrayList<>();
    }

    @Override
    public void create(Usuario usuario) {
        listaUsuario.add(usuario); 
    }

    @Override
    public Usuario read(String cedula) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getCedula().equals(cedula)) {
                return usuario;
            }
        }
 return null;
    }

    @Override
    public void update(Usuario usuario) {
        for (int i = 0; i < listaUsuario.size(); i++) {
          Usuario usu = listaUsuario.get(i); 
          if(usu.getCedula().equals(usu.getCedula())){
          listaUsuario.set(i, usu);
          break;
          }
        }
    }

    @Override
    public void delete(Usuario usuario) {
     Iterator<Usuario> it= listaUsuario.iterator();
        while (it.hasNext()) {
            Usuario usu = it.next();
            if(usu.getCedula().equals(usu.getCedula())){
            it.remove();
            break;
            }
            
        }
    }

    @Override
    public List<Usuario> findAll() {
        return listaUsuario;
    }
    
}
