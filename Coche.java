/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplogit;

/**
*ESTOY HACIENDO CAMBIOS DESDE LA RAMA NUEVA
 * Coche.java
 * Definición de la clase Coche
 * @author Elena
 */
public class Coche {
      

  // atributo de clase
  private static int kilometrajeTotal = 0;
  
  // método de clase
  public static int getKilometrajeTotal() {
    return Coche.kilometrajeTotal;
  }
  
  private String marca;
  private String modelo;
  private int kilometraje;

  public Coche(String ma, String mo) {
    this.marca = ma;
    this.modelo = mo;
    this.kilometraje = 0;
  }
  
  public int getKilometraje() {
    return this.kilometraje;
  }

  /**
   * Recorre una determinada distancia.
   * 
   * @param km distancia a recorrer en kilómetros
   */  
  public void recorre(int km) {
    this.kilometraje += km;
    Coche.kilometrajeTotal += km;
  }
}

