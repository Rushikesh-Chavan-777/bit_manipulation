public class LinearXOR {
    public static int LinearXOR1(int N) {
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
    
}
