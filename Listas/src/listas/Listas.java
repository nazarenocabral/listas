
package listas;

import Logica.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Listas {

    
    public static void main(String[] args) {
        
        // ARRAY LIST
        /*
        List<Persona> listaPersonas;
        listaPersonas = new ArrayList<Persona>();
        
        listaPersonas.add(new Persona(23,"nazareno",1));
        listaPersonas.add(new Persona(23,"eliana",2));
        
        for(Persona per : listaPersonas)
        {
            System.out.println(per);
        }
        
        */
        
        Map <Integer, String> criptomonedas = new HashMap<>();
        
         criptomonedas.put(1, "bitcoin");
         criptomonedas.put(2, "Ethereum");
         criptomonedas.put(3, "Binance");
         criptomonedas.put(4, "Cardano");
         criptomonedas.put(5, "Tether");
         
         System.out.println("Clave: " + criptomonedas.keySet());  /// obtiene todas las claves
         System.out.println("valores: " + criptomonedas.values()); /// obtiene todos los valores
          
        
        
        
        
        
    }
    
}
