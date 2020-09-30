package search;

import java.util.*;

public class BinarySearch {
	
	public static void main(String []args){
       	 int[] ia = {1,2,10,6,9,3,8,0,7,5};
       	 Arrays.sort(ia);
       	 int item = args.length > 0 ? Integer.parseInt(args[0]) : 0;
       	 int correctResult = Arrays.binarySearch(ia, 6);
       	 int searchResult = search(ia, 6);
       	 System.out.println(correctResult == searchResult);    	 
     }

    private static int search(int[] array, int item) {
		int low = 0;
		int high = array.length - 1;
		while(low < high) {
			int mid = (low + high) / 2;
			if (array[mid] == item) {
				return mid;
			} else if (array[mid] > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}