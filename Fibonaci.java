/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci;

/**
 *
 * @author Helfi Apriliyandi F
 */
public class Fibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("No 2 :");
    for (int i = 0; i < 10; i++) {
      System.out.println((i + 1) + " : " + fibonacci(i));
    }
    }
    public static int fibonacci(int n) {
    if ( n == 0 ) {
      return 0;
    }

    if ( n == 1) {
      return 1;
    }

    if ( n == 2 ) {
      return 1;
    }

    return (fibonacci(n - 2) + fibonacci(n - 1));

  }
    
}
