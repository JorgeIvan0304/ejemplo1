package mx.com.gm.ejercisio1;

import java.util.regex.*;

class validarpin {
    
    public static boolean isValidPinCode(String pin){ 
        //API de java para expresiones regulares contruido en el objeto Pattern del paquete java.util.regex
          String regex = "^[0-6]{1}[0-6]{2}\\s{0,1}[0-6]{3}$";
          Pattern p = Pattern.compile(regex);
          
          if(pin.length() == 4 || pin.length() == 6){ //reviso la longitud del caracter que se encuentre entre el rango correcto
              return true;
          }else if( pin == null){
              return false;
          }
          pin.replaceAll("[^a-z]", ""); //remplazo letras y caracteres para no se tomados como valores numericos
          //El Objeto Matcher agrupa todos los resultados que pueda producir la expresion regex
          Matcher m =p.matcher(pin);
          //retornara si el pin coincidio con el regex
          return m.matches();
    }
  
}
