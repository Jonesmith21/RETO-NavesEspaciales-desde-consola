
package fabrica;

import consola.NaveTripulada;
import java.util.ArrayList;


public class Tripulada {
    
      //Funcion creadora de objetos y los guarda en una lista
    
    public ArrayList<NaveTripulada> addTripulada(){
        
        NaveTripulada gabo = new NaveTripulada("Gabriel Garcia Marquez", 52.0, 68.9, 1927,"Colombia","Literatura");
        
        NaveTripulada galeano = new NaveTripulada("Eduardo German Maria Hughes Galeano", 46.0, 79.2, 1940,"Urugay","Literatura");
        
        NaveTripulada borges = new NaveTripulada("Jorge Luis Borges", 38.0, 86.7, 1899,"Argentina","Literatura");
        
          ArrayList<NaveTripulada> tripuladaList = new ArrayList<>();
      
     tripuladaList.add(gabo);
     tripuladaList.add(galeano);
     tripuladaList.add(borges);
          
     return tripuladaList;   
    } 
    
}
