
public class QuickSorter {

	public QuickSorter() {
		
	}

	public int[] sort(int[] array, int left, int right) {
		if (left >= right) {
		  return array;
		}
		
		int pivot = left;
		int i = left;
		int j = left + 1;

		int pivotValue = array[pivot];
		while (j <= right) {
			int underTest = array[j];
		
			if (underTest < pivotValue) {
				switchValues(array, i+1, j);
				i++;
			}
			j++;
		}
		switchValues(array, i, pivot);

		return sort((sort(array, left, i-1)), i+1, right);
	}

	private void switchValues(int[] array, int i, int j) {
        int iValue = array[i];
        int jValue = array[j];
        array[i] = jValue;
        array[j] = iValue;
	}
}
