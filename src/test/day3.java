package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void WebLoginCarLoan() {
		//selenium
		System.out.println("WebLoginCarLoan");

	}
	
	@BeforeMethod
	public void beforeEvery() {
		System.out.println(" I will execute before every test method in day 3 class");
	}
	@AfterMethod
	public void afterEvery() {
		System.out.println(" I will execute after every test method in day 3 class");
	}
	
	@BeforeSuite
	public void BfSuite() {
		System.out.println("I am no 1");
	}
	
	@Test
	public void MobileSignInCarLoan() {
		//Appium
		System.out.println("MobileSignInCarLoan");

	}
	@Test
	public void APICarLoan() {
		
		System.out.println("APICarLoan");

	}

}
