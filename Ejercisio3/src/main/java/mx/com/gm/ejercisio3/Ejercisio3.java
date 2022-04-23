package mx.com.gm.ejercisio3;
import static mx.com.gm.ejercisio3.encontrar.encontrar;

public class Ejercisio3 {

    public static void main(String[] args) {
        char array1[] ={'a','b','c','d','f'};
        char array2[] ={'o','p','q','s','t'};
        
        System.out.println("la letra perdida de: "+array1+" es "+encontrar(array1));
        System.out.println("la letra perdida de: "+array2+" es "+encontrar(array2));
    }
}
