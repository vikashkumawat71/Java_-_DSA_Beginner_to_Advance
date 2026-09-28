public class javabasics16 {
    public static void main(String[] args){
        //logical AND

        System.out.println( (10>5) && (10>8));
        System.out.println( (10>5) && (10>20));
        System.out.println( (10>20) && (10>8));
        System.out.println( (1>5) && (3>8));

        //logical OR

        System.out.println( (10>5) || (10>8));
        System.out.println( (10>5) || (10>20));     
        System.out.println( (10>20) || (10>8));
        System.out.println( (1>5) || (3>8));

        //logical NOT

        System.out.println( !(10>5) );
        System.out.println( !(10>20) );
    }

    
}
