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
public class TestAbstract {
  public static void main(String[] args) throws Exception {
    Weapon weapon = new Knife();

    Weapon knife = new Knife();
    Weapon gun = new Gun(10);

    knife.attack();
    gun.attack();
    gun.attack();

    Knife knife2 = new Knife();
    Weapon gun2 = new Gun(10);

    knife2.attack();
    gun2.attack();
    gun2.attack();
  }
} 

