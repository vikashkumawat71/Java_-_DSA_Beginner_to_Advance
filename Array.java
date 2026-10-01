public class Array {
    static void Traversal(int A[]){
        for(int i = 0;i < A.length;i++){
            System.out.print(A[i] +" ");
        }
    }
    static int  LinearSearch(int key, int A[]){
        for(int i = 0;i < A.length;i++){
            if(key == A[i])
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int A[] = {8, 6, 3, 9, 4};
        Traversal(A);
        System.out.println(LinearSearch(6, A));
    }
}
