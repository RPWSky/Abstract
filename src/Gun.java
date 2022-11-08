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
public class Gun extends Weapon {
  public int bullets;

  public Gun(int bullets) {
    this.bullets = bullets;
  }

  @Override
  public void attack() {
    if (bullets > 0) {
      bullets--;
      System.out.println("Menembakkan peluru");
      System.out.println("Sisa peluru: " + bullets);
      if (bullets == 9)
        System.out.println("Senjata");
    } else {
      System.out.println("Peluru habis!");
      System.out.println("Isi ulang");
      reload();
    }
  }

  public void reload() {
    this.bullets += 10;
  }
}