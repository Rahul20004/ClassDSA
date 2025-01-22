import java.util.Scanner;
public class PrintMultiples {
    static void print(int n, int k){
        // base case
        if(k==1){
            System.out.println(n);
            return; // it is necessary to stop the recursive calls
        }
        // recursion work
        print(n, k-1);
        // self work
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        print(n,k);
    }
}
