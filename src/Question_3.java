public class Question_3 {
//    given an array of all distinct integer where (0<=arr[i]<=n-1), n is size of array replace arr[i] with arr[arr[i]].
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 6, 5, 0, 2};
        replaceArray(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    static void replaceArray(int[] array){
        int n = array.length;
        for(int i=0;i<array.length;i++){
            array[i] = array[i] * n;
        }
        for(int i=0;i<array.length;i++){
            int ind = array[i]/n;
            int val = array[ind] /n;
            array[i] = array[i] + val;
        }
        for(int i=0;i<array.length;i++){
            array[i] = array[i] % n;
        }
    }
}
