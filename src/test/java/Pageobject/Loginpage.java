package Pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
    //driver.get("https://www..in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2FUrbano-Fashion-Oversized-Textured-shirttxtovhf-01-olivegrn-2xl%2Fdp%2FB0DJ8BGD36%2Fref%3Dnav_signin%3F_encoding%3DUTF8%26dib%3DeyJ2IjoiMSJ9.yMaeYylreWHY9JnxiBd6UY3-PnjTQtU_g_t2ZXtZlCqANxGzu3OvN4-T4SrRIzfhZWAj-EPsLt0rsPsO_8ZnNfxs9nkeRb90kInItJf4zCi1hL3UntUHCW3xsU0F6MJHMvGda_03lfkkxR-TsJkMGc0Z5OD6MbEuXFE0QPUwc6_e475xQCdLbK_re7N-25ARBFTGc-XxFRY4a6ovh6WXRqKn2JCtLQ5j4jJAgiMl4IAZxIbyHrrdfIItitt2hOUW3f_TQoVq6GL_ldkpk0fBdTun_T_V9ytNm27FzhlQtqlbrFLOnWu-jFNdX7nYzkVuMWxFhaiW7sGEr4loXPihg2dsqZO_CJrCjnmmi3i9occq_NeHlCNGTBiyao1mFU2CvU6YSVT6AA_mRn3SNcVNCPG3RKQOEXpPq-diFz3JUAfR9ruPfls0fvWQJ5hIauCY._uStxogsCQ3SOcRk9JsxuEIs-glImbsmK4uLXJvW8kA%26dib_tag%3Dse%26pf_rd_i%3D1968024031%26pf_rd_m%3DA1VBAL9TL5WCBF%26pf_rd_s%3Dmerchandised-search-1%26qid%3D1742487707%26refinements%3Dp_85%253A10440599031%252Cp_n_pct-off-with-tax%253A2665402031%26rnid%3D2665398031%26rps%3D1%26s%3Dapparel%26sr%3D1-1%26th%3D1%26psc%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.flipkart.com/");
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
      
      
      
      driver.findElement(By.xpath("//span[text()='Login']")).click();
      
      
     // driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("PravinkumarM02@gmail.com");
      
    
	}

}
