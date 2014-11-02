import static org.junit.Assert.*;

import org.junit.Test;


public class QuickSorterTest {

	@Test
	public void sortsArrayOfOne() {
		int[] sortedArray = {1};
		int[] unsortedArray = {1};
		QuickSorter sorter = new QuickSorter(new FirstPivotSelector());
		assertArrayEquals(sortedArray, sorter.sort(unsortedArray));
		assertEquals(0, sorter.getComparisonCount());
	}

	@Test
	public void sortsArrayOfOneWithLastPivot() {
		int[] sortedArray = {1};
		int[] unsortedArray = {1};
		QuickSorter sorter = new QuickSorter(new LastPivotSelector());
		assertArrayEquals(sortedArray, sorter.sort(unsortedArray));
		assertEquals(0, sorter.getComparisonCount());
	}

	@Test
	public void sortsArrayOfTwo() {
		int[] sortedArray = {1, 2};
		int[] unsortedArray = {2, 1};
		QuickSorter sorter = new QuickSorter(new FirstPivotSelector());
		assertArrayEquals(sortedArray, sorter.sort(unsortedArray));
		assertEquals(1, sorter.getComparisonCount());
	}

	@Test
	public void sortsArrayOfTwoWithLastPivot() {
		int[] sortedArray = {1, 2};
		int[] unsortedArray = {2, 1};
		QuickSorter sorter = new QuickSorter(new FirstPivotSelector());
		assertArrayEquals(sortedArray, sorter.sort(unsortedArray));
		assertEquals(1, sorter.getComparisonCount());
	}

	@Test
	public void leavesTwoElementSortedArrayAlone() {
		int[] sortedArray = {1, 2};
		int[] originalArray = {1, 2};
		QuickSorter sorter = new QuickSorter(new FirstPivotSelector());
		assertArrayEquals(sortedArray, sorter.sort(originalArray));
		assertEquals(1, sorter.getComparisonCount());
	}

	@Test
	public void leavesFourElementSortedArrayAlone() {
		int[] sortedArray = {1, 2, 3, 4};
		int[] originalArray = {1, 2, 3, 4};
		QuickSorter sorter = new QuickSorter(new FirstPivotSelector());
		assertArrayEquals(sortedArray, sorter.sort(originalArray));
	}

	@Test
	public void sortsArrayOfFour() {
		int[] sortedArray = {1, 2, 3, 4};
		int[] originalArray = {2, 1, 3, 4};
		QuickSorter sorter = new QuickSorter(new FirstPivotSelector());
		assertArrayEquals(sortedArray, sorter.sort(originalArray));
	}

	@Test
	public void sortsSecondArrayOfFour() {
		int[] sortedArray = {1, 2, 3, 4};
		int[] originalArray = {3, 2, 1, 4};
		QuickSorter sorter = new QuickSorter(new FirstPivotSelector());
		assertArrayEquals(sortedArray, sorter.sort(originalArray));
	}

	@Test
	public void sortsSecondArrayOfFourWithLastPivot() {
		int[] sortedArray = {1, 2, 3, 4};
		int[] originalArray = {3, 2, 1, 4};
		QuickSorter sorter = new QuickSorter(new LastPivotSelector());
		assertArrayEquals(sortedArray, sorter.sort(originalArray));
	}

	@Test
	public void sortsSecondArrayOfFourWithMedianPivot() {
		int[] sortedArray = {1, 2, 3, 4};
		int[] originalArray = {3, 2, 1, 4};
		QuickSorter sorter = new QuickSorter(new MedianPivotSelector());
		assertArrayEquals(sortedArray, sorter.sort(originalArray));
	}

}
