package day43.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {
	@Test
	 void abc() {
		System.out.println("this is abc from c2"); 
	 }
	@BeforeTest
	 void bt() {
		 System.out.println("this is BeforeTest method"); 
	 }

}
