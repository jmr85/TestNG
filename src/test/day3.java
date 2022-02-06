package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before executing any methods in the class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after executing all methods in the class");
	}

	@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String urlname) {
		//selenium
		System.out.println("WebLoginCarLoan");
		System.out.println("URL name: " + urlname);

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
	
	@Test(enabled=false)
	public void MobileSignInCarLoan() {
		//Appium
		System.out.println("MobileSignInCarLoan");

	}
	@Test(timeOut=4000)
	public void MobileSignOutCarLoan() {
		//Appium
		System.out.println("Mobile SIGNOUT");
	}
	@Test(dependsOnMethods={"WebLoginCarLoan", "MobileSignOutCarLoan"})
	public void APICarLoan() {
		
		System.out.println("APICarLoan");

	}

}
