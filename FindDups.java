package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,6,6,8,9,9,3,3};
		
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-1; i++ ) {
			
			if (nums[i]==nums[i+1])
				System.out.println(nums[i] +  "is duplicate");
		}
	}

}
