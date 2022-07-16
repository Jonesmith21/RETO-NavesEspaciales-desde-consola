
package Comparacion;

import consola.NaveLanzadera;
import fabrica.Lanzadera;


public class ComparaLanzadera {
    
   public static  NaveLanzadera buscarNave1 (String nave){
       
       NaveLanzadera naveFound = null;
       Lanzadera lanzadera = new Lanzadera();
       
       for(int i=0; i<lanzadera.addLanzadera().size(); i++)
       {
           String name = lanzadera.addLanzadera().get(i).getNombre();
           if(name.contains(nave))
           {
               naveFound = lanzadera.addLanzadera().get(i);
           }
       }
       
       return naveFound;
   }
       
   }
    
           
           
           
           
           
