package testannotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAnnotation {

	@Test
	public void test() {
		assertEquals(3, 2,"not equal to actual value");
	}
}
