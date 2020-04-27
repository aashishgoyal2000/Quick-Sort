class QuickSortWithMiddleElement{
	public static void sort (Comparable[] arr){
		sort(arr,0,arr.length-1);
	}

	public static void sort (Comparable[] arr, int lo,int hi) {
		if(hi <= lo) return;
		int mid = partition(arr, lo, hi);
		sort(arr, lo, mid-1);
		sort(arr, mid+1, hi);
	}

	public static int partition (Comparable[] arr, int lo, int hi){
		int i = lo - 1,j = hi + 1, mid = (hi + lo) / 2;
		while (true) {
			while (arr[++i].compareTo(arr[mid]) < 0)
				if (i == hi) break;
			while (arr[--j].compareTo(arr[mid]) > 0)
				if (j == lo) break;
			if (i >= j) break;
			exch(arr, i, j);
		}

		exch(arr, mid, i);
		return i;
	}

	public static void exch(Comparable[] arr, int a,int b){
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}