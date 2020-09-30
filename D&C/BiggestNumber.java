import java.util.Arrays;

public class BiggestNumber {
	public static void main(String[] args) {
		int[] ar = {1, 3, 5, 6, 9};
		System.out.println(max(ar));
	}

	private static int max(int[] array) {
		if(array.length == 2) {
			return array[0] > array[1] ? array[0] : array[1];
		}
		int submax = max(Arrays.copyOfRange(array, 1, array.length));
		return array[0] > submax ? array[0] : submax;
	}
}