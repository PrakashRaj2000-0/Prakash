package testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public Properties p;
	public WebDriver driver;
	
	@BeforeClass
	public void setup() throws IOException {
		//loading config.properties file
		p = new Properties();

        // ✅ Load config.properties file
		FileInputStream fis = new FileInputStream("D:\\OpenCartV1.21\\src\\test\\resources\\config.properties");
        p.load(fis);
		driver = new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
		driver.get(p.getProperty("appURL"));//reading url from property file
		
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
