
public class LastPivotSelector implements PivotSelector {

	@Override
	public int selectIndex(int[] array, int left, int right) {
		return right;
	}

}
