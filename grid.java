public class grid{
    static void path(String str, int r, int c){
        if(r==1 &&c==1){
            System.out.println(str);
            return ;
        }
        if(r>1) path(str+ "d",r-1, c);
        if(c>1) path(str+ "r",r, c-1);
            
        
        
    }
    public static void main(String[] args) {
        int r=3;
        int c=3;
        path(" ", r, c);
       
    }
    
}
