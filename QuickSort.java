public class QuickSort implements SortingAlgorithm{
	public void sort(int[] arr){
		part(arr, 0, arr.length-1);
	}

	private void part(int[] arr, int low, int high){
		if (low < high){
			int p = partActual(arr, low, high);
			part(arr, low, p-1);
			part(arr, p+1, high);
		}
	}

	private void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	private int partActual(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = (low-1);
		for (int j = low; j<high; j++){
			if (arr[j] < pivot){
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);

		return i+1;
	}
}