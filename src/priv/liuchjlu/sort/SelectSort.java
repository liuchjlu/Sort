package priv.liuchjlu.sort;

public class SelectSort {
	public void selectSort(int[] arr) {
		if (arr == null || arr.length <= 1)
			return;
		int index = 0;
		// 只需要比较n-1次
		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			// 从i+1比较即可，因为index已经默认为i,注意j+1不会越界，因为i<n-1
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index])
					index = j;
			}
			if (index != i) {
				swap(arr, i, index);
			}
		}

	}

	public void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 8, 20 };
		SelectSort sort = new SelectSort();
		sort.selectSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
