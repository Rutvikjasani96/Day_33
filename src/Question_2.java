public class Question_2 {
//    given n array elements, calculate no. of pairs (i,j) such that (arr[i] + arr[j] % m = 0), m is given.
//    Note : (i!=j) && (pairs(i,j) is same as (j,i)).
    public static void main(String[] args) {
        int[] array = {17, 2, 5, 4, 6, 23, 13, 26, 14, 18, 15, 30, 35};
        int m = 10;
        System.out.println("no. of pairs : "+noOfPairs(array,m));
    }
    static int noOfPairs(int[] array,int m){
        int[] mod = new int[m];
        for(int i=0;i<array.length;i++){
            mod[array[i]%m]++;
        }
        int noOfPairsCnt = (mod[0]*(mod[0]-1))/2;
        int i = 1;
        int j = mod.length-1;
        while(i<j){
            noOfPairsCnt += mod[i] * mod[j];
            i++;
            j--;
        }
        if(i==j){
            noOfPairsCnt += (mod[i]*(mod[i]-1))/2;
        }
        return noOfPairsCnt;
    }
}
