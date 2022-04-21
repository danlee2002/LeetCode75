public class CanPlaceFlower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; 
        if  (n == 0)
            return true;
        if  (n > (flowerbed.length + 1)/2)
            return false; 
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right =  (i == flowerbed.length - 1)|| (flowerbed[i  + 1] == 0 ); 
             if (left && right) {
                i++;
                count++; 
                if (count  >= n) {
                    return true; 
                }
            }    
            }
        }
        return false; 
    }
    
}
