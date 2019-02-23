public class quicksort {
	public static void quickSort(int a[], int left, int right) {
		 int pivot = a[left];
		 int i = left;
		 int j = right;
		 int aux;
		 while (i < j) {
		  while(a[i] <= pivot && i < j  ) {
		   i++;
		  }
		  while(a[j]>pivot) {
		   j--;
		  }
		  if(i < j) {
		   aux = a[i];
		   a[i] = a[j];
		   a[j] = aux;
		  }
		 }
		 a[left] = a[j];
		 a[j] = pivot;
		 if(left < j-1) 
		  quickSort(a, left, j-1);
		 if(j+1 < right)
		  quickSort(a, j+1, right);
		}

}
