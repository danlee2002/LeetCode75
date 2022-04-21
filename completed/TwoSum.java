import java.util.HashMap;
import java.util.Map;
public class TwoSum {
	
	public static int[] twoSum(int[] num, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			int value = target - num[i];
			if (numMap.containsKey(value)) {
				return new int[] {numMap.get(value),i};


			} else  {
				
				numMap.put(num[i], i);
			
				

			}

		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] sampleInput = new int[]{1,2,3,4};
		int[] indexes = twoSum(sampleInput, 3);
		for (int index: indexes) {
			System.out.printf("%d\n",index);
		}
		
	}
}
