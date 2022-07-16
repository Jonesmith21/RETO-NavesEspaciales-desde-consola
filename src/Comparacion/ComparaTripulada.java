
package Comparacion;

import consola.NaveTripulada;
import fabrica.Tripulada;


public class ComparaTripulada {
    
     public static NaveTripulada buscarNave3 (String nave){
        
        NaveTripulada naveFound = null;
        Tripulada tripulada = new Tripulada();
        
        for(int i=0; i<tripulada.addTripulada().size(); i++)
        {
            String name = tripulada.addTripulada().get(i).getNombre();
            if(name.contains(nave))
            {
                naveFound = tripulada.addTripulada().get(i);
            }
        }
                          
       return naveFound;
    }
}
