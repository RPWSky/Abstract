/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg6.pbo;

/**
 *
 * @author user
 */
public abstract class Weapon {
  public abstract void attack();

  public void info() {
    System.out.println("Ini senjata");
  };
}