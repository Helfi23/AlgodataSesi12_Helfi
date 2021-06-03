/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deret;

/**
 *
 * @author Helfi Apriliyandi F
 */
public class Deret {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("No 3 : ");
    System.out.println(deret(1));
    }
    public static int deret(int n) {
    System.out.println(n);

    if (n > 100) {
      return n;
    } else {
      return deret(n + 2);
    }

  }
}
