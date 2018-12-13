package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Retirement;

public class TestPV {

	@Test
	public void testPV() {
		Retirement retirement = new Retirement(40, 0.07, 20, 0.02, 10000.00,2642.00);
		double totalAmt = Math.abs(retirement.TotalAmountSaved());
		assertEquals(totalAmt,1454485.55,0.01);
		System.out.print(totalAmt);
	}

}
