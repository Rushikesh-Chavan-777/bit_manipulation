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

    public static void main(String[] args) {

    }

}
