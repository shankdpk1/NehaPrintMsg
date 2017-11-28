package ArraySorting;

import java.util.Arrays;
import java.util.Collections;

public class DecSort {

	public static void main(String[] args) 
	{
		Integer[] arr= {22,1,44,13,6,17};
		//String[] arr1= {"neha","avi","bali","akshit"};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
    }

}
