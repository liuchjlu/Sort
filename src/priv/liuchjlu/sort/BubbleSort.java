package priv.liuchjlu.sort;

public class BubbleSort {
	public void bubbleSort(int[] arr) {
		if (arr.length <= 1 || arr == null)
			return;
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public void swap(int[] arr, int i, int j) {
		int tmp;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 9, 5, 3, 1, 3 };
		// BubbleSort bbs = new BubbleSort();
		BubbleSort bbs = new BubbleSort();
		bbs.swap(arr, 1, 2);
		bbs.bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
