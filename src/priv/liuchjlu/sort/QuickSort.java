package priv.liuchjlu.sort;

public class QuickSort {
	public void sort(int[] arr) {
		if (arr.length <= 1 || arr == null)
			return;
		quickSort(arr, 0, arr.length - 1);
	}

	public void quickSort(int[] arr, int left, int right) {
		if (left >= right)
			return;
		int index = partition(arr, left, right);
		if (index > left)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index + 1, right);
	}

	public int partition(int[] arr, int left, int right) {

		int key = arr[left];
		int keypoint = left;
		while (left < right) {
			// 下面两个while的顺序 不能变，因为key=arr[left],所以要后面的指针先动，否则最后执行swap(arr,
			// keypoint, left)的时候，此left也许并不符合要求(left < right && arr[left] <=
			// key)
			while (left < right && arr[right] >= key)
				right--;
			while (left < right && arr[left] <= key)
				left++;
			swap(arr, left, right);
		}
		swap(arr, keypoint, left);
		return left;
	}

	/*
	 * 优化，上面代码中基准数已经在pivotKey中保存了，所以不需要每次交换都设置一个temp变量，在交换左右指针的时候只需要先后覆盖就可以了。
	 * 这样既能减少空间的使用还能降低赋值运算的次数。优化代码如下：
	 */
	// public int partition(int[] arr, int left, int right) {
	//
	// int key = arr[left];
	// int keypoint = left;
	// while (left < right) {
	// // 下面两个while的顺序 不能变，因为key=arr[left],所以要后面的指针先动，否则最后执行swap(arr,
	// // keypoint, left)的时候，此left也许并不符合要求(left < right && arr[left] <=
	// // key)
	// while (left < right && arr[right] >= key)
	// right--;
	// arr[left] = arr[right];
	// while (left < right && arr[left] <= key)
	// left++;
	// arr[right] = arr[left];
	// }
	// arr[left] = key;
	// return left;
	// }

	public void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 2, 7, 3, 8, 1 };
		QuickSort qs = new QuickSort();
		qs.sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}
}
