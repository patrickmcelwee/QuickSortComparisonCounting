
public class MedianPivotSelector implements PivotSelector {

	@Override
	public int selectIndex(int[] array, int left, int right) {
		int leftValue = array[left];
		int rightValue = array[right];
		int middle = ((right - left) / 2) + left;
		int middleValue = array[middle];

		if (leftValue < middleValue) {
			if (middleValue < rightValue) {
				return middle;
			} else if (leftValue < rightValue) {
				return right;
			} else {
				return left;
			}
		} else { // middleValue < leftValue
			if (leftValue < rightValue) {
				return left;
			} else if (middleValue < rightValue) {
				return right;
			} else {
				return middle;
			}
		}
	}

}
