
package test;

public class Kata {
    
        
  
        public static String solution(String str) {
            
           String j = ""; 
     for(int i = 0; i< str.length(); i++){
         j += str.charAt(str.length()-(i+1));
            
     }
       return j;
    }
    
        public static void main(String[] args) {
            
            System.out.println("solution = "+ Kata.solution("hola"));
    }
}
