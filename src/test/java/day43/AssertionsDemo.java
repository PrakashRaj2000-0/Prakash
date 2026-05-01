package day43;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

    @Test
    void testTitle() {
        String exp_title = "Apple";
        String act_title = "Mango";

        Assert.assertEquals(exp_title, act_title);
    }
}


/*import org.apache.logging.log4j.core.util.Assert;
import org.testng.annotations.Test;





public class AssertionsDemo {
	@Test
	void testTitile() {
		String exp_title="Apple";
		String act_title="Mango";
		
		/*if(exp_title.equals(act_title)) {
			System.out.println("test_passed");
			
		}
		else {
			System.out.println("test_failed");
		}
	
	
		Assert.assertEquals(exp_title, act_title);
	}

}
*/
