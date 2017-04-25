package priv.liuchjlu.sort;

public class HeapSort {
	public static void heapAdjust(int[] arr, int start, int end) {
		// int temp = arr[start];

		for (int i = 2 * start + 1; i <= end; i *= 2) {
			// ���Һ��ӵĽڵ�ֱ�Ϊ2*i+1,2*i+2

			// ѡ������Һ��ӽϵ��±�
			if (i < end && arr[i] < arr[i + 1]) {
				i++;
			}
			if (arr[start] >= arr[i]) {
				break; // �Ѿ�Ϊ�󶥶ѣ�=�����ȶ��ԡ�
			}
			// arr[start] = arr[i]; // ���ӽڵ�����
			swap(arr, start, i);// ����start��i��ֵ
			start = i; // ��һ��ɸѡ
		}

		// arr[start] = temp; // ������ȷ��λ��
	}

	public static void heapSort(int[] arr) {
		if (arr == null || arr.length == 0)
			return;

		// �����󶥶�
		for (int i = arr.length / 2; i >= 0; i--) {
			heapAdjust(arr, i, arr.length - 1);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			swap(arr, 0, i);
			heapAdjust(arr, 0, i - 1);
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 4, 1, 7, 0, 6 };
		HeapSort hs = new HeapSort();
		hs.heapSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
