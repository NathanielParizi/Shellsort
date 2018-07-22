
public class Shellsort {

	public static void main(String[] args) {

		int arr[] = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 8, 7, 2 };

		shellSort(arr);

		for (int x : arr) {

			System.out.print(x + ", ");
		}

	}

	public static int[] shellSort(int[] arr) {
		int n = arr.length;
		// Start with a big gap, then reduce the gap
		for (int gap = n / 2; gap > 0; gap = gap / 2) {

			for (int i = gap; i < n; i += 1) {

				int temp = arr[i];

				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
					arr[j] = arr[j - gap];
				}

				arr[j] = temp;
				return arr;
			}
		}
		return null;

	}

}
