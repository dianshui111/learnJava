public class Test11{

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.reverse(123));
	}
}

class Solution {
    public int reverse(int x) {
        boolean negative=x<0;
        if(negative) x=-x;
        long y=0;
        while(x>=10){
            y=(y+x%10)*10;
            x=x/10;        
        }
        y=+x;
        if(y>Integer.MAX_VALUE||y<Integer.MIN_VALUE) return 0;
        if(negative) y=-y;
        return (int) y;      
    }
}