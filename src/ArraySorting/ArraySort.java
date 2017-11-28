package ArraySorting;

import java.util.Arrays;
import java.util.Collection;

public class ArraySort {
	
	public static void main(String arg[]) {
		
		int[] arr= {22,1,44,13,6,17};
		//String[] arr1= {"neha","avi","bali","akshit"};
		//Arrays.sort(arr1);
		// can sort subarray, Array starts with 0-n then it will sort 1-4 else will remain same
		Arrays.sort(arr, 1,4);
		System.out.println(Arrays.toString(arr));
		
	}

}
