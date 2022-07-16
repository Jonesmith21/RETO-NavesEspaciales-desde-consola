
package test;

import static Comparacion.ComparaLanzadera.buscarNave1;
import static Comparacion.ComparaNoTripulada.buscarNave2;
import static Comparacion.ComparaTripulada.buscarNave3;
import java.util.Scanner;


public class TestPaginaWeb {
    public static void main(String[] args) {
        
        while(true){              
        System.out.println("Escoge tu tipo de nave: \n"
                + "1 para NaveLanzadera \n"
                + "2 para Nave No Tripulada \n"
                + "3 para Nave Tripulada");
        
         Scanner sc = new Scanner(System.in);
        
         int rp = sc.nextInt();
         
         if(rp == 1){
             while(true){
         
             System.out.println("Escoge tu Nave lanzadera:");                          
             Scanner sc2 = new Scanner(System.in);
             String rp2 = sc2.nextLine();
                                      
            if(rp2.equals("atras") ){      
               break;
            }
             else {                             
                System.out.println(buscarNave1(rp2));
             }                                       
           }       
         }
         
         if(rp == 2){
             while(true){
                 
             System.out.println("Escoge tu Nave No Tripulada:");
             Scanner sc2 = new Scanner(System.in);
             String rp2 = sc2.nextLine();
             
             
             if(rp2.equals("atras")){
                 break;
             }
             else {
                 System.out.println(buscarNave2(rp2));
             }                                       
           }       
         }
         
         if(rp == 3){
             while(true){
                 
             System.out.println("Escoge tu Nave  Tripulada:");
             Scanner sc2 = new Scanner(System.in);
             String rp2 = sc2.nextLine();
             
             
             if(rp2.equals("atras")){
                 break;
             }
             else {
                 System.out.println(buscarNave3(rp2));
             }                                       
           }       
         }
         
         else {
             
         }
                 
         
    }
  }  
}
