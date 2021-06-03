/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pangkatbilangan;

/**
 *
 * @author Helfi Apriliyandi F
 */
public class PangkatBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("No 1 :");
    System.out.println(pangkat(5, 2));
    }
    public static int pangkat(int angka, int eksponen) {
    if (eksponen == 1 ) {
      return angka;
    } else {
      return angka * pangkat(angka, eksponen - 1); 
    }

  }
    
}
