
package test;


public class Reto {
    public static void main(String[] args) {
       int x = 0;
       int cotaSup = 1000;
        for(int j =2; j<cotaSup;j++ ){          
            for(int i=2; i<j; i++){
                if (j==2){
                    System.out.println(j+"\n");
                    x++;
                }
                else if(j%i != 0){
                    if(i<(j-1)){
                         continue;
                    }
                    else if(i==(j-1)){
                        System.out.println(j +"\n");
                        x++;
                    }
                }
                else if(j%i ==0){                  
                   break;
                }               
            }
        }
        System.out.println("x = " + x);
    }
}
