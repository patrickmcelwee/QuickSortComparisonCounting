import static org.junit.Assert.*;

import org.junit.Test;


public class QuickSorterTest {

	@Test
	public void sortsArrayOfOne() {
		int[] sortedArray = {1};
		int[] unsortedArray = {1};
		QuickSorter sorter = new QuickSorter();
		assertArrayEquals(sortedArray, sorter.sort(unsortedArray, 0, 0));
	}

	@Test
	public void sortsArrayOfTwo() {
		int[] sortedArray = {1, 2};
		int[] unsortedArray = {2, 1};
		QuickSorter sorter = new QuickSorter();
		assertArrayEquals(sortedArray, sorter.sort(unsortedArray, 0, 1));
	}

	@Test
	public void leavesTwoElementSortedArrayAlone() {
		int[] sortedArray = {1, 2};
		int[] originalArray = {1, 2};
		QuickSorter sorter = new QuickSorter();
		assertArrayEquals(sortedArray, sorter.sort(originalArray, 0, 1));
	}

	@Test
	public void leavesFourElementSortedArrayAlone() {
		int[] sortedArray = {1, 2, 3, 4};
		int[] originalArray = {1, 2, 3, 4};
		QuickSorter sorter = new QuickSorter();
		assertArrayEquals(sortedArray, sorter.sort(originalArray, 0, 3));
	}

	@Test
	public void sortsArrayOfFour() {
		int[] sortedArray = {1, 2, 3, 4};
		int[] originalArray = {2, 1, 3, 4};
		QuickSorter sorter = new QuickSorter();
		assertArrayEquals(sortedArray, sorter.sort(originalArray, 0, 3));
	}

	@Test
	public void sortsSecondArrayOfFour() {
		int[] sortedArray = {1, 2, 3, 4};
		int[] originalArray = {3, 2, 1, 4};
		QuickSorter sorter = new QuickSorter();
		assertArrayEquals(sortedArray, sorter.sort(originalArray, 0, 3));
	}

}
