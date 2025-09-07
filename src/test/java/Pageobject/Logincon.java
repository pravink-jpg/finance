package Pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logincon {
	 WebDriver driver;
	public Logincon(WebDriver driver){
		
		this.driver=driver;
		
	}
	public void Lgbutton(){
		
     driver.get("https://www.flipkart.com/");
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
      
      
      
      driver.findElement(By.xpath("//span[text()='Login']")).click();
      
      
     // driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("PravinkumarM02@gmail.com");
      
    
	}
}
