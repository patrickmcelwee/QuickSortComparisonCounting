import static org.junit.Assert.*;

import org.junit.Test;


public class MedianPivotSelectorTest {

	@Test
	public void returnsZeroForSingleArray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {1};
		assertEquals(0, selector.selectIndex(array, 0, array.length - 1));
	}

	@Test
	public void returnsZeroForSortedDoubleArray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {1, 3};
		assertEquals(0, selector.selectIndex(array, 0, array.length - 1));
	}

	@Test
	public void returnsZeroForUnsortedDoubleArray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {3, 1};
		assertEquals(0, selector.selectIndex(array, 0, array.length - 1));
	}

	@Test
	public void worksForSortedEvenArray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		assertEquals(3, selector.selectIndex(array, 0, array.length - 1));
	}

	@Test
	public void worksForReverseEvenArray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {6, 5, 4, 3, 2, 1};
		assertEquals(2, selector.selectIndex(array, 0, array.length - 1));
	}

	@Test
	public void worksForEarlyMedianEvenArray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {4, 5, 6, 3, 2, 1};
		assertEquals(0, selector.selectIndex(array, 0, array.length - 1));
	}

	@Test
	public void worksForLateMedianEvenArray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {4, 1, 6, 3, 2, 5};
		assertEquals(5, selector.selectIndex(array, 0, array.length - 1));
	}

	@Test
	public void worksForSortedOddArray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		assertEquals(3, selector.selectIndex(array, 0, array.length - 1));
	}

	@Test
	public void worksForSortedEarlySubarray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		assertEquals(1, selector.selectIndex(array, 0, 3));
	}

	@Test
	public void worksForSortedLateSubarray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		assertEquals(4, selector.selectIndex(array, 3, array.length - 1));
	}

	@Test
	public void worksForSortedMiddleSubarray() {
		PivotSelector selector = new MedianPivotSelector();
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		assertEquals(6, selector.selectIndex(array, 4, 8));
	}

}
