package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countTest {

	@Test
	public void count() {
        JunitTesting test = new JunitTesting();
        int output = test.count("alabama");
        assertEquals(4, output);
    }
}
