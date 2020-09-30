import java.util.Arrays;

public class TestSum {
	public static void main(String[] args) {
		int[] ar = {1, 3, 5, 6, 9};
		System.out.println(sum(ar));
	}

	private static int  sum(int[] array) {
		if(array.length == 0) {
			return 0;
		}

		return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
	}
}