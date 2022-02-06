package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
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

	@Parameters({"URL", "APIKey/usrname"})
	@Test
	public void WebLoginCarLoan(String urlname, String key) {
		//selenium
		System.out.println("WebLoginCarLoan");
		System.out.println("URL name: " + urlname);
		System.out.println("URL KEY name: " + key);
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
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - username password - good credit card= row
		//2nd username password - no credit history
		//3rd fraudelent credit history
		Object[][] data = new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination(row)
				
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
				
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
}
