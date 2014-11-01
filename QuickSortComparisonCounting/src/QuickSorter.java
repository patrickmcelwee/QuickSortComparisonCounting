
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
				int valueToSwitch = array[i+1];
				array[i+1] = underTest;
				array[j] = valueToSwitch;
				i++;
			}
			j++;
		}
		int iValue = array[i];
		array[i] = pivotValue;
		array[pivot] = iValue;

		return sort((sort(array, left, i-1)), i+1, right);
	}
}
