package day43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C1 {
	@Test
	 void xyz() {
			System.out.println("this is abc from c1"); 
		 }
	@AfterTest
		 void at() {
			 System.out.println("this is AfterTest method"); 
		 }
}
