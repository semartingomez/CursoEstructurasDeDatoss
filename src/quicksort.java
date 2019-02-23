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
	public void bubbleSort(int [] a) {
		int temp;
		boolean swapped= false;
		do {
			swapped=false;
			for (int i = 0; i < a.length; i++) {
				if(a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=true;
				}
			}
		}
		while(swapped);
	}
	public static void insertionSort(int[]a) {


		int index, temp;
		for (int i = 1; i < a.length; i++) {
			index=i; temp=a[i];
			while(index>0&&temp<a[index-1]) {
				a[index]=a[index-1];
				index-=1;
			}
			a[index]=temp;
		}

	}
	public int[] mergeSort(int[]a) {
		int size=a.length;
		if(size>1){
			int size_par= size/2;
			int[]a_1=new int[size_par];
			int []a_2= new int[size-size_par];
			for (int i = 0; i < size_par; i++) 
				a_1[i]=a[i];
			for(int  i = size_par; i<size; i++) 
				a_2[i-size_par]=a[i];
			a_1=mergeSort(a_1);
			a_2=mergeSort(a_2);
			a=merge(a_1,a_2);
		}
		return a;
	}

	public int[] merge(int[]a_1, int[] a_2) {
		int[]resp= new int [a_1.length+ a_2.length];
		int index_a1=0, index_a2=0, index=0;
		while(index_a1< a_1.length && index_a2<a_2.length) {
			if(a_1[index_a1]<a_2[index_a2]) {
				resp[index]= a_1[index_a1];
			}
			else {
				resp[index]=a_2[index_a2];
				index+=1; index_a2+=1;
			}
		}
		if(index_a1<a_1.length) {
			for(int i= index_a1; i<a_1.length;i++) {
				resp[index]= a_1[i];
				index +=1;
			}
		}
		else {
			for(int i=index_a2;i<a_2.length;i++) {
				resp[index]=a_2[i];
				index+=1;
			}
		}
		return resp;
	}





	public static void main(String[] args) {
		int a[]= {5,7,3,9,12,4,8,15};
		insertionSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}

}
