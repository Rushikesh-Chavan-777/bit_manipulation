public class single_number2 {

    public static int singlenumber2(int[] arr){
        int ones = 0;
        int twos = 0;
        for(Integer i : arr) {
            ones = (ones^arr[i])&~twos;
            twos = (twos^arr[i])&~ones;
        }
        return ones;
    }

    
    public static void main(String[] args) {
        
    }
    
}
