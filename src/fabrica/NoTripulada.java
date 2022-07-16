
package fabrica;

import consola.NaveNoTripulada;
import java.util.ArrayList;


public class NoTripulada {
    
    //Funcion creadora de objetos y los guarda en una lista
    
    public ArrayList<NaveNoTripulada> addNoTripulada(){
        
        NaveNoTripulada platon = new NaveNoTripulada("Aristocles Platon", 30.00, 81.5, -427,"Grecia","Filosofía");
        
        NaveNoTripulada camus = new NaveNoTripulada("Albert Camus", 35.00, 78.8, 1960,"Argelia","Filosofía");
        
        NaveNoTripulada foucault = new NaveNoTripulada("Michel Foucault", 43.00, 74.6, 1926,"Francia","Filosofía");
        
          ArrayList<NaveNoTripulada> NoTripuladaList = new ArrayList<>();
      
     NoTripuladaList.add(platon);
     NoTripuladaList.add(camus);
     NoTripuladaList.add(foucault);
          
     return NoTripuladaList;   
    }   
}
