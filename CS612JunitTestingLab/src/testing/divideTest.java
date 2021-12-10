package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {

	@Test
	public void divide() {
        JunitTesting test = new JunitTesting();
       int correctOutput = (int) test.divide(-8, 2);
       assertEquals(-4, correctOutput);

 //       int wrongOutput = (int) test.divide(8, 2);
 //       assertEquals(-4, wrongOutput);
    }
}