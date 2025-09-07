package Pageobject;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homepage {

	public static void main(String arg[]) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
	WebElement	homeFurnitureMenu =driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
	homeFurnitureMenu.click();
		Actions actions = new Actions(driver);
        actions.moveToElement(homeFurnitureMenu).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\"Beds\"]")).click();
		
	}
	}
		
	

