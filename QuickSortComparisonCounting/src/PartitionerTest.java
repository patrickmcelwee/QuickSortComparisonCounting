import static org.junit.Assert.*;

import org.junit.Test;


public class PartitionerTest {

	@Test
	public void returnsArrayWithLengthOne() {
		int[] singleDigitArray = {1};
		Partitioner subject = new Partitioner(singleDigitArray, 0, 1);
		assertEquals(singleDigitArray, subject.partition());
	}

}
