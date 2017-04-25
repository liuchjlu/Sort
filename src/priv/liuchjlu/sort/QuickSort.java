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
			// ��������while��˳�� ���ܱ䣬��Ϊkey=arr[left],����Ҫ�����ָ���ȶ����������ִ��swap(arr,
			// keypoint, left)��ʱ�򣬴�leftҲ��������Ҫ��(left < right && arr[left] <=
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
	 * �Ż�����������л�׼���Ѿ���pivotKey�б����ˣ����Բ���Ҫÿ�ν���������һ��temp�������ڽ�������ָ���ʱ��ֻ��Ҫ�Ⱥ󸲸ǾͿ����ˡ�
	 * �������ܼ��ٿռ��ʹ�û��ܽ��͸�ֵ����Ĵ������Ż��������£�
	 */
	// public int partition(int[] arr, int left, int right) {
	//
	// int key = arr[left];
	// int keypoint = left;
	// while (left < right) {
	// // ��������while��˳�� ���ܱ䣬��Ϊkey=arr[left],����Ҫ�����ָ���ȶ����������ִ��swap(arr,
	// // keypoint, left)��ʱ�򣬴�leftҲ��������Ҫ��(left < right && arr[left] <=
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
