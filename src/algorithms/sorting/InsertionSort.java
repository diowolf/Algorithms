package algorithms.sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		Integer[] myIntArr = { 4, 67, 5, 7, 8, 22, 11, 22 };

		SortUtils.print("Before insertion sort:");
		SortUtils.print(myIntArr);

		Integer[] sortedArr = insertionSort(myIntArr);

		SortUtils.print("After insertion sort:");
        SortUtils.print(sortedArr);
	}
	
	public static Integer[] insertionSort(Integer[] arr) {
		// It starts at one so it doesn't throw an index out of bounds exception 
		for (int i = 1; i < arr.length; i++) {
			// we initialize the hold variable to keep the value of the current cell safe
			int hold = arr[i];
			// the variable j that will work to check and move variables to be sorted
			int j = i;
			
			
			while (j > 0 && arr[j - 1] > hold) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = hold;
		}
		
		return arr;
	}

}
