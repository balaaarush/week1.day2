package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		
		Arrays.sort(nums);
	
		
		int length =nums.length;
		System.out.println(length);
	System.out.println("Min no"+nums[0]);
	System.out.println("Max no"+nums[length-1]);
		
	}

}
