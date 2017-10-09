
package boletin2_7;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float k=273, f=32, cc;
        Scanner sc=new Scanner (System.in);
        System.out.println("Agregar grados centigrados :");
        cc=sc.nextFloat();
        System.out.println("Grados Kelvin: "+ (cc+k) +" Grados Fahrenheit: "+ (f+cc));
    }
    
}
