package ArraySorting;

import java.util.Arrays;

public class CompMain {

	public static void main(String[] args) {
			ComparatorSort [] arr= {new  ComparatorSort(121, "String", "Neha"), new  ComparatorSort(120, "int", "abc"),
					                 new  ComparatorSort(122, "float", "xyz") };
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
				}
			Arrays.sort(arr, new SortCompBy());
			for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			}

	}

}
