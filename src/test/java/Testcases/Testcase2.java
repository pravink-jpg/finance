package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pageobject.Homecon;
import Pageobject.Logincon;

public class Testcase2 {
@Test
	public void loginbt() {
		
		WebDriver driver=new ChromeDriver();
		
		Logincon first= new Logincon(driver);
		first.Lgbutton();
		Homecon second=new Homecon(driver);
		second.hbtn();
		
	
	}

}
