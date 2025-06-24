import java.util.ArrayList;

public class power_set {

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
    
}
