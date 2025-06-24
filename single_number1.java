public class single_number1 {
        public static int singlenumber1(int[] arr){
        int XOR = 0;
        for(Integer i : arr) {
            XOR = XOR^arr[i];
        }
        return XOR;
    }
    public static void main(String[] args) {
        
    }
    
}
