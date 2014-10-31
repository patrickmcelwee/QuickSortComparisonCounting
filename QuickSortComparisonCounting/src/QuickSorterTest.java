import static org.junit.Assert.*;

import org.junit.Test;


public class QuickSorterTest {

	@Test
	public void sortsArrayOfOne() {
		int[] sortedArray = {1};
		int[] unsortedArray = {1};
		QuickSorter sorter = new QuickSorter();
		assertArrayEquals(sortedArray, sorter.sort(unsortedArray));
	}

	@Test
	public void sortsArrayOfTwo() {
		int[] sortedArray = {1, 2};
		int[] unsortedArray = {2, 1};
		QuickSorter sorter = new QuickSorter();
		assertArrayEquals(sortedArray, sorter.sort(unsortedArray));
	}

	@Test
	public void leavesTwoElementSortedArrayAlone() {
		int[] sortedArray = {1, 2};
		int[] originalArray = {1, 2};
		QuickSorter sorter = new QuickSorter();
		assertArrayEquals(sortedArray, sorter.sort(originalArray));
	}

}
