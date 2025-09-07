package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {
	
	public static void main(String arg[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/OFF-LIMITS-STUSSYY-Running-Swizzle/dp/B0CQYSYXKP/ref=sr_1_1_sspa?crid=8ASCBDYSWTUB&dib=eyJ2IjoiMSJ9.dWXJk-729wgpMgSSAj5oC5EHr9hYXy9__AqibozXQuiz_DkylCgRK9DUk1Z2T7Nt31rqvB_lCM5JaZB1hjdtCDlwRdrD9TrMKOB7jBhdUUNZCtTnsuVCjKC8709lPzxoFxi4HwRuUY_xIyFdQV3_HZkVsOv_Y00FpNpc2VFHsfkrgZlAv2SmdgS2glYPxh2ETSVqAuagMkhfzJ7q1JPDc9q-Hj0vuTqUhREVW1drDjW0Byr1rQFndNncV_taH94ezcqYL21tM6o9dviG4G-9AqKNY1T0b-5LxPRWwzr-iM8.St4cbeVVIpEPo8XLkjZhm7I0Lzxv2TpZ_GsSvq79CIg&dib_tag=se&keywords=branded+shoes+for+men&qid=1743838738&sprefix=branded+shoes+for+men%2Caps%2C346&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
	driver.findElement(By.id("(//img[@class='s-image'])[1]")).click();
	
	}

}
