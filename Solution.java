import java.util.*;

class Solution {
    public static int revp(int x){
        StringBuilder re=new StringBuilder();
          while(x>=10){
            int n=x%10;
              x=x/10;
            if(n==0 & re==null) break;
            re.append((char) n); 
            } 
        re.append(String.valueOf(x));
        return Integer.parseInt(re.toString());  
    }
    
    public static int reverse(int x) {

        return x<0? (0-revp(0-x)):(revp(x));
        
    }

    public static void main(String[] args)  {
       System.out.println(reverse(321));
    }
}