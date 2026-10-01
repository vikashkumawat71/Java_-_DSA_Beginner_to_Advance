//keep entering numbers till user enters a multiple of 10

import java.util.*;
public class javabasics38 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter the no : ");
            int n = sc.nextInt();
           

            if(n % 10 == 0){
                break;
            }
            System.out.println(n);

        }while(true);
        sc.close();
        

      
    }
    
}
