package problems;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 5, 9, 3, 8, 2, 0, 6};
		System.out.println("index value is " + binarySearch(arr, 0));
	}

	public static int linearSearch(int[] arr, int searchedNumber) {
		int searchedIndex = -1;
		for (int i=0; i<arr.length; i++) {
			if(arr[i] == searchedNumber) {
				searchedIndex = i;
			}
		}
		return searchedIndex;
	}
	
	public static int binarySearch(int[] arr, int searchedNumber) {
		int searchedIndex = -1;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int start = 0, end = arr.length-1, middle=0;
		while (start <= end) {
			middle = (start + end)/2;
			if(arr[middle] == searchedNumber) {
				searchedIndex = middle;
				break;
			}else if (arr[middle] > searchedNumber) {
				end = middle - 1;
			}else {
				start = middle + 1;
			}
		}
		return searchedIndex;
	}
	
	
}
