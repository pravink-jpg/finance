package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Homecon {
	WebDriver driver;
   public Homecon(WebDriver driver){
		this.driver=driver;
		
   }
   public void hbtn() {
	   
	    WebElement	homeFurnitureMenu =driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
	    homeFurnitureMenu.click();
		Actions actions = new Actions(driver);
        actions.moveToElement(homeFurnitureMenu).perform();
        
        driver.findElement(By.xpath("//a[text()=\"Beds\"]")).click();
		
	}
	}

