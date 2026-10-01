// WAP to print number from 1 to n using while loop
import java.util.*;

public class javabasics30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int counter = 1;
        while(counter <= n){
            System.out.print(counter + " ");
            counter++;
        }
        sc.close();
         
    }
    
}
