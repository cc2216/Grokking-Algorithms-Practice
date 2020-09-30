import java.util.Arrays;

public class CountItem {
	public static void main(String[] args) {
		int[] ar = {1, 3, 5, 6, 9};
		System.out.println(count(ar));
	}

	private static int count(int[] array) {
		if(array.length == 0) {
			return 0;
		}
		return 1 + count(Arrays.copyOfRange(array, 1, array.length));
	}
}