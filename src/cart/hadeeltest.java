package cart;

import static org.junit.Assert.*;

import org.junit.Test;

import shoop.hwTest;



public class hadeeltest {

	hwTest cart = new hwTest();
	@Test
	public void testAddbook0() {
		assertTrue(cart.count==0 && cart.price==0);
	}
	@Test
	public void testAddbook1() {
		cart.addbook(127);
		assertTrue(cart.count==1 && cart.price==127);
	}
	@Test
	public void testAddbook2() {
		cart.addbook(100);
		assertTrue(cart.count==2 && cart.price==227);
	}

}
