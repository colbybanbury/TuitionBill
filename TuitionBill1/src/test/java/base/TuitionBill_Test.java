package base;

/**
 * This junit class tests the TuitionBill class using accepted values taken from 
 * a trusted source.
 * It creates a new TuitionBill called Bill and it tests totalCost() and paymentCalc()
 * It does not test the scanner functionality of TuitionBill
 * 
 * @author Colby Banbury
 *
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TuitionBill_Test {
	
	TuitionBill bill;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		bill  = new TuitionBill(25000, 2, .045, 120);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testtotalCost() {
		System.out.println(bill.totalCost());
		assertEquals(bill.totalCost(), 103040.2, 0.01);
	}
	
	@Test
	public void testpaymentCalc() {
		System.out.println(bill.paymentCalc());
		assertEquals(bill.paymentCalc(), 1067.89, 0.01);
	}
	
	
		
		

}
