package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	void test() {
		
		//Assert.assertEquals("xyz", "xyz");
		//Assert.assertEquals(123,785);
		//Assert.assertEquals("abc",785);
		//Assert.assertNotEquals(123, 234);//pass
		
	//	Assert.assertTrue(true);//pass
		//Assert.assertTrue(false);//fail
	//	Assert.assertTrue(1==2);//fail
	Assert.fail();
	}

}
