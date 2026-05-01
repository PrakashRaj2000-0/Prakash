package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {

	 @AfterSuite
		void as() {
			System.out.println("This is AfterSuite method..");
		}
		
	    @BeforeSuite
		void bs() {
			System.out.println("This is BeforeSuite method..");
		}
	    @BeforeTest
		 void bt() {
			 System.out.println("this is BeforeTest method"); 
		 }
	    @AfterTest
		 void at() {
			 System.out.println("this is AfterTest method"); 
		 }
	    @BeforeClass
		void login1() {
			System.out.println("this is before class method..");
		}
	
		
		@AfterClass
		void logout1() {
			System.out.println("this is After Class method  ..");
		}

	    @BeforeMethod
		void login() {
			System.out.println("this is before method in..");
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
			System.out.println("this is After method ..");
		}
}
