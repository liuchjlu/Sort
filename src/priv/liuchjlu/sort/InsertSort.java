package priv.liuchjlu.sort;

public class InsertSort {
	public void insertSort(int[] arr) {
		if (arr == null || arr.length < 2)
			return;
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			// j=i,������j=i-1,���j=i-1,��������arr={5,2}
			int j = i;
			while (j > 0 && arr[j - 1] > key) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 4, 3, 8 };
		InsertSort sort = new InsertSort();
		sort.insertSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
