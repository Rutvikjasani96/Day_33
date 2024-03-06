public class Question_1 {
//    given a & b, a > b. find no. of m such that a%m = b%m & m>1.
    public static void main(String[] args) {
        int a=16;
        int b=4;
        int n = a-b;
        int m = noOfFactors(n) - 1;  // no. of m is factor of a-b except 1.
        System.out.println("possible m : "+m);
    }
    static int noOfFactors(int n){
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n % i == 0){
                cnt+=2;
            }else if(n%i == n / i){
                cnt++;
            }
        }
        return cnt;
    }
}
