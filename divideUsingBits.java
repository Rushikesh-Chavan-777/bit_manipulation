public class divideUsingBits {
        //dividing two numbers smarter and faster cause peed matters :)
    public static int divideBitWise(int dividend, int divisor) {
        //check for edge cases 
        if(dividend == divisor) return 1;
        //make a sign boolean to use at the end
        boolean sign = true;
        if(divisor >=0 && dividend < 0 ) {sign = false;}
        if(dividend >= 0 && divisor < 0) {sign = false;}
        //runa. while loop against teh numerator and denominator 
        int n = Math.abs(dividend);
        int d = Math.abs(dividend);
        int ans = 0;
        while(n >= d) {
            int ctr = 0;
            while(n > (d<<ctr+1)) {
                ctr++;
            }
            ans = ans + (1<<ctr);
            n = n - (d<<ctr);
        }
        if( ans >= (1<<31) && sign == true) {
            return Integer.MAX_VALUE;
        }
        if(ans >= (1<<31) && sign == false ) {
            return Integer.MIN_VALUE;
        }
        return sign ? ans : (-1 * ans);
    }
    public static void main(String[] args) {
        
    }
    
}
