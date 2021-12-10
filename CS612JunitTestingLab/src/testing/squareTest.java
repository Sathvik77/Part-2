package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	 public void square() {
        JunitTesting test = new JunitTesting();
        int output = test.square(5);

        assertEquals(25, output);
    }
}
