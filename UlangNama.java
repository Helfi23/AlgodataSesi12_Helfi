/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulangnama;

/**
 *
 * @author Helfi Apriliyandi F
 */
public class UlangNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("No 4 : ");
    System.out.println(nameRepeat("Helfi A Firdaos", 1));
    }
    public static String nameRepeat(String nama, int n) {
    System.out.println(nama);
    if (n == 99) {
      return nama;
    } else {
      return nameRepeat(nama, n + 1);
    }
    }
}
