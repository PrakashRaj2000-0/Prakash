package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testbase.BaseClass;


public class TC_AccountRegistrationTest extends BaseClass{


		// TODO Auto-generated method stub
		
		
		@Test
		public void Verify_registration() throws InterruptedException {
			HomePage hp =new HomePage(driver);
			hp.clickRegister();
			AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
			regpage.SelectGender();
			regpage.setFirstName("ytfuyg");
			regpage.setEmail(randomstring().toUpperCase());
			regpage.setLastName("ytfuyg");
			//regpage.setEmail("yrh@gmail.com");
		
			regpage.setEmail(randomstring()+"@gamil.com");
//for number repage.setNumber(randomnumber());
		}

	public String randomstring()
	{
		 @SuppressWarnings("deprecation")
		 String generatedstring=RandomStringUtils.randomAlphabetic(5);
		 return generatedstring;
	}

	/* public String randomnumber()
	{
		 String generatednumber=RandomStringUtils.randomNumeric(5);
		 return generatednumber;
	}
	ublic String randomAlphanumeric()
	{
		 String generatednumber=RandomStringUtils.randomNumeric(5);
		 String generatedstring=RandomStringUtils.randomAlphabetic(5);
		 return generatednumbe+"@"+generatedstring;
	}
	
	*/
}
