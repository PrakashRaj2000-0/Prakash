package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	public AccountRegistrationPage(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement clickGender;
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement txtFirstname;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement txtLastname;
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	
	
	
public void SelectGender() {
	clickGender.click();
}
public void setFirstName(String fname) throws InterruptedException {
	txtFirstname.sendKeys(fname);
	Thread.sleep(5000);
}
public void setLastName(String lname) {
	txtLastname.sendKeys(lname);
}
public void setEmail(String Ename) {
	txtEmail.sendKeys(Ename);
}
}
