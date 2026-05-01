package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;


public class TC_AccountRegistrationTest {


		// TODO Auto-generated method stub
		public WebDriver driver;
		public Properties p;
		@BeforeClass
	@Parameters({"os","browser"})
		public void setup(String os,String br) throws IOException {
			//loading config.properties file
			FileReader file =new FileReader("./src//test//resources//config.properties");
			p=new Properties();
			p.load(file);
			switch(br.toLowerCase()) {
			case "chrome" : driver = new ChromeDriver();break;
			case "edge" : driver = new EdgeDriver();break;
			case "firefox" : driver = new FirefoxDriver();break;
			default:System.out.println("Invalud browser4- name");return;
			
			}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
			driver.get(p.getProperty("appURL"));//reading url from property file
			driver.manage().window().maximize();
		}
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
		@Test
		public void Verify_registration() throws InterruptedException {
			HomePage hp =new HomePage(driver);
			hp.clickRegister();
			AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
			regpage.SelectGender();
			//regpage.setFirstName("ytfuyg");
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
