/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HI andres
 */
public class VistaTelefono {
  private Scanner escribir; 
  
  public VistaTelefono(){
  escribir = new Scanner(System.in);
  }
  public Telefono ingresarTelefono(){
  escribir = new Scanner(System.in);
      System.out.println("Ingresar los datos del telefono");
      System.out.println("Ingrese su codigo:");
      int codigo = escribir.nextInt();
      System.out.println("Ingrese el numero de celular:");
      String numero = escribir.next();
      System.out.println("Ingrese el tipo:");
      String tipo =escribir.next();
      System.out.println("Ingrese la operadora:");
      String operadora = escribir.next();
      return new Telefono(codigo, numero, tipo, operadora);
  }
  public Telefono actualizarTelefono(){
  escribir = new Scanner(System.in);
      System.out.println("Ingrese el codigo del telefono que desea actualizar");
      int codigo= escribir.nextInt();
      System.out.println("Ingrese los nuevos Datos");
      System.out.println("Numero de celular:");
      String numero = escribir.next();
      System.out.println("Tipo:");
      String tipo = escribir.next();
      System.out.println("Operadora:");
      String operadora = escribir.next();
      return new Telefono(codigo, numero, tipo, operadora);    
  }
  public Telefono eliminarTelefono(){
  escribir = new Scanner (System.in);
      System.out.println("Ingrese el codigo del telefono que desea eliminar");
      int codigo = escribir.nextInt();
      return new Telefono(codigo, null, null, null);
  }
  public int buscarTelefono(){
  escribir = new Scanner(System.in);
      System.out.println("Ingresa el codigo del telefono que desea buscar");
      int codigo = escribir.nextInt();
      return codigo;
  }
  public void verTelefono(Telefono telefono){
      System.out.println("Datos del Usuario: "+ telefono);
  }
  public void verTelefonos(List<Telefono> telefonos){
      for (Telefono telefono : telefonos) {
          System.out.println("Datos del telefono:" + telefono);
      }
  }
}
