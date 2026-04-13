public class ZeroCount {
    static int countzero(int a){
        if(a==0) return 0;
        int count = (a%10==0)? 1:0;
        return count + countzero(a/10);
    }
    
    public static void main(String[] args){
        int a=10203404;
        System.out.println(countzero(a));
        
    
    }
}
