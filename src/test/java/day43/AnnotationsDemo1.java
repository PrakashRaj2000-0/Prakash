package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	@BeforeMethod
	void login() {
		System.out.println("this is login in..");
	}
	@Test(priority=1)
	void serach() {
		System.out.println("this is serach..");
	}
	@Test(priority=2)
	void Advancedsearch() {
		System.out.println("this is Advancedsearch..");
	}
	@AfterMethod
	void logout() {
		System.out.println("this is logout ..");
	}

}
