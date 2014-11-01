
public class QuickSorter {

	private int comparisonCount;
	private FirstPivotSelector pivotSelector;

	public QuickSorter() {
		setComparisonCount(0);
		pivotSelector = new FirstPivotSelector();
	}

	public int[] sort(int[] array) {
		return doTheSort(array, 0, array.length - 1);
	}

	private int[] doTheSort(int[] array, int left, int right) {
		if (left >= right) {
		  return array;
		}
		setComparisonCount(getComparisonCount() + (right - left));
		
		int pivot = pivotSelector.select(array, left, right);
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

		return doTheSort((doTheSort(array, left, i-1)), i+1, right);
	}

	private void switchValues(int[] array, int i, int j) {
        int iValue = array[i];
        int jValue = array[j];
        array[i] = jValue;
        array[j] = iValue;
	}

	public int getComparisonCount() {
		return comparisonCount;
	}

	public void setComparisonCount(int comparisonCount) {
		this.comparisonCount = comparisonCount;
	}
}
