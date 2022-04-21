public class ReverseBit {
    //int n = xBBBBBBBB 
    public static int reverseBits(int n) {

        //considers base case
        if (n == 0)
            return 0;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            //compares last bit to 1 and adds 1 otherwise
            if ((n & 1) == 1) {
                result++;
            }
            //makes second last bit the last bit 
            n >>= 1;
        }
        return result; 
    }
    
}
