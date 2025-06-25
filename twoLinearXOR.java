public class twoLinearXOR {
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
}
