import java.util.ArrayList;

public class singlenumberIII {
    public static ArrayList<Integer> singlenumberIII3(int[] nums) {
        //xor out all numbers and find the * of the two single number s
        int XOR = 0;
        for(Integer i : nums) {
            XOR ^= nums[i];
        }
        //find the right most set bit. The distinguising bit for both the numbers;
        int diff_bit = XOR ^ -XOR;
        //now, add both the numbers into buckets say a and b 
        int a = 0;
        int b = 0;
        for (Integer num : nums) {
            //if check to see of the bits match. if they do take in mucket and XOR out that blodd number. Let the unique ones remain
            if((num&diff_bit) == 0) {
                a ^= num;
            }else {
                b^=num;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        return arr;
    }
    
}
