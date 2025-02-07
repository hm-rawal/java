package problems;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(arr, 9)));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		for(int i=0; i<nums.length; i++) {
			int firstNum = nums[i];
			int secondNum = target - firstNum;
			for (int j=i+1; j<nums.length; j++) {
				if(nums[j]==secondNum) {
					indices[0] = i;
					indices[1] = j;
					break;
				}
			}
		}
		return indices;
	}

}
