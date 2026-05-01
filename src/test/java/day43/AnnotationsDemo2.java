package day43;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class AnnotationsDemo2 {
	@BeforeClass
	void login() {
		System.out.println("this is login in..");
	}
	@Test(priority=2)
	void serach() {
		System.out.println("this is serach..");
	}
	@Test(priority=1)
	void Advancedsearch() {
		System.out.println("this is Advancedsearch..");
	}
	@AfterClass
	void logout() {
		System.out.println("this is logout ..");
	}

}
