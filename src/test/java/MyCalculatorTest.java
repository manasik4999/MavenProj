import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalculatorTest {

	@Test
	public void test1() {
		assertEquals(5,new MyCalculator().getSum(2,3));
	}
	public void test2() {
		assertEquals(10,new MyCalculator().getSum(5,5));
	}
	public void test3() {
		assertEquals(5,new MyCalculator().getDiff(9,4));
	}
	public void test4() {
		assertEquals(8,new MyCalculator().getDiff(10,2));
	}
}
