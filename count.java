public class count {
    static boolean countoccurofkey(int[]arr,int i, int key) {
        if(i==arr.length) return false;
        if (arr[i] ==key )return true;
        return countoccurofkey(arr, i+1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,42,5};
        int key =2;
        int i =0;
        System.out.println(countoccurofkey(arr, i, key));
    }
}
