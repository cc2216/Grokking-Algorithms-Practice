package sort;

import java.util.*;

public class SelectionSort {
	
	public static void main(String []args){
       	 int[] ia = {1,2,10,6,9,3,8,0,7,5};
       	 sort(ia);
       	 System.out.println(Arrays.toString(ia));
     }

    private static void sort(int[] array) {
		int minIndex = 0;
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			System.out.println("minIndex: " + array[minIndex]);
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
}