
public class QuickSorter {

	public QuickSorter() {
		
	}

	public int[] sort(int[] array) {
		if (array.length == 1) {
		  return array;
		}
		int current = array[0];
		int underTest = array[1];
		
		if (underTest < current) {
			array[0] = underTest;
			array[1] = current;
		}
		return array;
	}
}
