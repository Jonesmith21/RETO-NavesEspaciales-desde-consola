package test;
public class RetoPrimos2 {
    public static void main(String[] args) {
    int cotaSup = 100;
        for(int j = 2; j< cotaSup ; j++ ){          
            for(int i=2; i<=j; i++){   
                if(i==j){                   
                    System.out.println(j +"\n");                                        
                }
                else if(j%i == 0){                  
                   break;
                }                                              
            }
        }     
    }
}
    

