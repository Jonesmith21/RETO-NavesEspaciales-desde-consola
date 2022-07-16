
package Comparacion;

import consola.NaveNoTripulada;
import fabrica.NoTripulada;


public class ComparaNoTripulada {
    
    public static NaveNoTripulada buscarNave2 (String nave){
        
        NaveNoTripulada naveFound = null;
        NoTripulada noTripulada = new NoTripulada();
        
        for(int i=0; i<noTripulada.addNoTripulada().size(); i++)
        {
            String name = noTripulada.addNoTripulada().get(i).getNombre();
            if(name.contains(nave))
            {
                naveFound = noTripulada.addNoTripulada().get(i);
            }
        }
                          
       return naveFound;
    }
}
