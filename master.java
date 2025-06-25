import java.util.ArrayList;

public class master {

    public static ArrayList<ArrayList<Integer>> powerset(int[] arr) {

        int n_subsets = 1 << arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // looping through each number, where number is the number of the subsets
        for (int i = 0; i < n_subsets; i++) {
            ArrayList<Integer> llist = new ArrayList<Integer>();
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) != 0) {
                    llist.add(arr[j]);
                }
            }
            ans.add(llist);

        }
        return ans;
    }

    public static int singlenumber1(int[] arr){
        int XOR = 0;
        for(Integer i : arr) {
            XOR = XOR^arr[i];
        }
        return XOR;
    }


    public static int singlenumber2(int[] arr){
        int ones = 0;
        int twos = 0;
        for(Integer i : arr) {
            ones = (ones^arr[i])&~twos;
            twos = (twos^arr[i])&~ones;
        }
        return ones;
    }



    public static ArrayList<Integer> singlenumberIII(int[] nums) {
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

    public static int LinearXOR(int N) {
        if(N%4 == 0) {
            return 1;
        }else if(N%4 == 2) {
            return N+1;
        }
        else if(N%4 == 3) {
            return 0;
        }else {
            return N;
        }
    }
    public static int twolinearXOR(int a, int b) {
        return LinearXOR(a-1) ^ LinearXOR(b);
    }

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
