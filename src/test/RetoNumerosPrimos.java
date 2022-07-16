
package test;


public class RetoNumerosPrimos {
    public static void main(String[] args) {
        int j=1;
        while(j<100){
            
            for(int i=2; i<j; i++){
                if(j%i != 0){
                    if(i<(j-1)){
                         continue;
                    }
                    else if(i==(j-1)){
                        System.out.println(j +"\n");
                    }
                }
                else if(j%i ==0){                   
                   break;
                }                           
            }
        j++;
        }
    }    
}
