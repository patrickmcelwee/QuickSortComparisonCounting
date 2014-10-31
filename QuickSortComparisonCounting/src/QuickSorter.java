
public class QuickSorter {

	public QuickSorter() {
		
	}

	public int[] sort(int[] array) {
		if (array.length == 1) {
		  return array;
		}
		int pivot = 0;
		int current = array[0];
		int underTest = array[1];
		array[0] = underTest;
		array[1] = current;
		return array;
	}
}
