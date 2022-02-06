package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String urlname) {
		//selenium
		System.out.println("WebLoginHomeLoan_PersonalLoan");
		System.out.println("URL name: " + urlname);
	}
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan() {
		//Appium
		System.out.println("MobileLoginHomeLoan");

	}
	@Test
	public void LoginAPIHomeLoan() {
		//Rest API automatiom
		System.out.println("LoginAPIHomeLoan");

	}

}
