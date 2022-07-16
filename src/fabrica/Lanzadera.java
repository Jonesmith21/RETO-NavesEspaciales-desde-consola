
package fabrica;

import consola.NaveLanzadera;
import java.util.ArrayList;


public class Lanzadera  {
  
          //Funcion creadora de objetos y los guarda en una lista
    
     public  ArrayList<NaveLanzadera> addLanzadera() {
         
   NaveLanzadera frida = new NaveLanzadera("Frida Kalo", 20.00, 50.00, 1940, "Mexico", "Arte" );
        
   NaveLanzadera velasquez = new NaveLanzadera("Diego Velázquez", 40.00, 70.00, 1599, "Español", "Arte" );
   
   NaveLanzadera vangogh = new NaveLanzadera("Vincent van Gogh", 35.00, 76.20, 1853, "HOlanda", "Arte" );
   
     ArrayList<NaveLanzadera> lanzaderaList = new ArrayList<>();
      
     lanzaderaList.add(frida);
     lanzaderaList.add(velasquez);
     lanzaderaList.add(vangogh);
     
     return lanzaderaList;
          
             
     }
   
  
} 
