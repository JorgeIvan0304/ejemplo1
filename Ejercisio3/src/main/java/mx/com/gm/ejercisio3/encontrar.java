package mx.com.gm.ejercisio3;
public class encontrar {
    public static char encontrar(char[] array){
        char palabraPerdida = array[0];
        for(char letter: array){ //recorrer el abecedario (en ingles) y comprueba si el parametro es una letra para devolver un true o un false en caso de que no
            if(letter != palabraPerdida) break; //compara letra por letra , hasta que encuentra la que falta y la retorna
            palabraPerdida++;
        }
        return palabraPerdida;
    }
}
