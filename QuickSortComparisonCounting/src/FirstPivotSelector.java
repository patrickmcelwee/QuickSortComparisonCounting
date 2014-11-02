
public class FirstPivotSelector implements PivotSelector {

	/* (non-Javadoc)
	 * @see PivotSelector#select(int[], int, int)
	 */
	@Override
	public int selectIndex(int[] array, int left, int right) {
		return left;
	}

}