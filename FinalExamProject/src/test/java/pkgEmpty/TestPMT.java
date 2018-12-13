package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class TestPMT {

	@Test
	public void testPMT() {
		
		Retirement retire = new Retirement(40, 0.07, 20, 0.02, 10000.00,2642.00);
		double amt = retire.AmountToSave();
		assertEquals(amt,554.13, 0.01);
		System.out.println(amt);

	}

}
