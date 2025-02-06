package problems;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 8, 2, 2, 1, 0 ,3, 9};
		System.out.println(Arrays.toString(arr));
//		for(int i = 0; i<arr.length; i++) {
//			swap(arr, i, returnIndexFrom(arr, i));
//		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int smallest(int[] intArray) {
		int smallestNumber=intArray[0];
		for (int i = 1; i<intArray.length; i++) {
			if (intArray[i]<smallestNumber) {
				smallestNumber = intArray[i];
			}
		}
		return smallestNumber;
	}
	
	public static int returnIndex(int[] intArray) {
		int smallestNumber = intArray[0];
		int indexOfSmallestNumber = 0;
		for (int i=1; i<intArray.length; i++) {
			if(intArray[i]<smallestNumber) {
				smallestNumber = intArray[i];
				indexOfSmallestNumber = i;
			}
		}
		return indexOfSmallestNumber;
	}
	
	public static int returnIndexFrom(int[] intArray, int indexValue) {
		int smallestNumber = intArray[indexValue];
		int indexOfSmallestNumber = indexValue;
		for (int i=indexValue; i<intArray.length; i++) {
			if(intArray[i]<smallestNumber) {
				smallestNumber = intArray[i];
				indexOfSmallestNumber = i;
			}
		}
		return indexOfSmallestNumber;
	}
	
	public static void swap(int[] intArray, int index1, int index2) {
		int temp = intArray[index1];
		intArray[index1] = intArray[index2];
		intArray[index2] = temp;		
	}

}
