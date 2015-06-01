package my.site;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void shouldreturnTrue(){
		BooleanTest demo = new BooleanTest();
		assertTrue(demo.bool());
	}

	@Test
	public void shouldreturnTrue(){
		BooleanTest demo = new BooleanTest();
		assertTrue(demo.bool2());
	}
	
}
