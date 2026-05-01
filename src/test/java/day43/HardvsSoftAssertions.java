package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {
	@Test
	void test_hardassertions() {
		
		System.out.println("testing1...");
		System.out.println("testing1...");
		Assert.assertEquals(1, 2);
		System.out.println("testing1...");
		System.out.println("testing1...");
	}
	@Test
   void test_softassertions() {
		System.out.println("testing...");
		System.out.println("testing...");
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(1, 2);
		System.out.println("testing...");
		System.out.println("testing...");
		sa.assertAll();
	}
	

}
