public class number_count {
    static int path(int n){
        //base case
        if(n==0 ||n==1){
            return 1;
        }
        return path(n-1)+path(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(path(n));
    }
    
}
