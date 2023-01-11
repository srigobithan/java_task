package samplejavaproject;

import java.util.Arrays;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] nums = {10,12,15,18};
		 	System.out.println("Array : "+Arrays.toString(nums));
			int x = nums[0];
			nums[0] = nums[nums.length-1];
			nums[nums.length-1] = x;
			System.out.println("Swap the first and last element of an array : "+Arrays.toString(nums));  
		   
	       
	}

}
