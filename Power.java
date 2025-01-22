public class Power {
    static int pow(int P, int q){
        //Base Case
        if (q==0)return 1;
        int smallans = pow(P,q/2);
        if(q%2==0){ // even
            return smallans *smallans;
        }  // odd
        return P* smallans* smallans ;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
}
