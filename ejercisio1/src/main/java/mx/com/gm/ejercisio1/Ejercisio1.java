package mx.com.gm.ejercisio1;

import java.util.Scanner;
import static mx.com.gm.ejercisio1.validarpin.isValidPinCode;

public class Ejercisio1 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        String num1;
        System.out.println("Ingrese el valor");
        num1 = leer.nextLine();
        System.out.println(num1+ ": "+isValidPinCode(num1) );
       
    }
}
