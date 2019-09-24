public class MergeSort implements SortingAlgorithm{
	public void sort(int[] arr){
		merge(arr, 0, arr.length-1);
	}

	private void merge(int[] arr, int start, int end){
		if (start < end){
			int center = (start+end)/2;
			merge(arr, start, center);
			merge(arr, center+1, end);
			mergeActual(arr, start, center, end);
		}
	}

	private void mergeActual(int[] a, int left, int mid, int right)
	{
		int n1=mid-left+1;
		int n2=right-mid;

		int L[]= new int [n1];
		int R[]= new int [n2];

		for (int i=0; i<n1; i++)
			L[i]=a[left+i];
		for (int j=0; j<n2; j++)
			R[j]=a[mid+1+j];

		int i=0, j=0;

		int k=left;
		while(i<n1 && j<n2)
		{
			if (L[i]<=R[j])
			{
				a[k]=L[i];
				i++;
			}
			else
			{
				a[k]=R[j];
				j++;
			}
			k++;
		}

		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}

		while(j<n2)
		{
			a[k]=R[j];
			j++;
			k++;
		}
	}

}
