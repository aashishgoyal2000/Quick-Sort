class ImprovedQuickSort{
	public static void sort (Comparable[] arr){
		sort(arr,0,arr.length-1);
	}

	public static void sort (Comparable[] arr, int lo,int hi) {
		if(hi <= lo + 10){
			InsertionFromAtoB.sort(arr,lo,hi + 1);
			return;	
		} 
		int mid = partition(arr, lo, hi);
		sort(arr, lo, mid-1);
		sort(arr, mid+1, hi);
	}

	public static int partition (Comparable[] arr, int lo, int hi){
		int i = lo,j = hi + 1;
		while (true) {
			while (arr[++i].compareTo(arr[lo]) < 0)
				if (i == hi) break;
			while (arr[--j].compareTo(arr[lo]) > 0)
				if (j == lo) break;
			if (i >= j) break;
			exch(arr, i, j);
		}

		exch(arr, lo, j);
		return j;
	}

	public static void exch(Comparable[] arr, int a,int b){
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}