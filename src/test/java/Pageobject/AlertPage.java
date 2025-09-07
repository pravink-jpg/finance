package Pageobject;



import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AlertPage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public AlertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    @FindBy(xpath = "//h5[text()='Alert (Simple Dialog)']/following-sibling::button")
    WebElement simpleAlertBtn;

    @FindBy(xpath = "//h5[text()='Alert (Confirm Dialog)']/following-sibling::button")
    WebElement confirmAlertBtn;

    @FindBy(xpath = "//h5[text()='Alert (Prompt Dialog)']/following-sibling::button")
    WebElement promptAlertBtn;

    @FindBy(xpath = "//h5[text()='Sweet Alert (Simple Dialog)']/following-sibling::button")
    WebElement sweetSimpleAlertBtn;

    @FindBy(xpath = "//h5[text()='Sweet Alert (Confirmation)']/following-sibling::button")
    WebElement sweetConfirmBtn;

    @FindBy(xpath = "//h5[text()='Sweet Modal Dialog']/following-sibling::button")
    WebElement sweetModalBtn;

    @FindBy(xpath = "//h5[text()='Minimize and Maximize']/following-sibling::button")
    WebElement minimizeMaximizeBtn;


    // ===== Page Methods =====

    public void handleSimpleAlert() {
        try {
            simpleAlertBtn.click();
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println("Simple Alert Text: " + alert.getText());
            alert.accept();
        } catch (Exception e) {
            System.out.println("Simple Alert handling failed: " + e.getMessage());
        }
    }

    public void handleConfirmAlert() {
        try {
            confirmAlertBtn.click();
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println("Confirm Alert Text: " + alert.getText());
            alert.dismiss(); // or alert.accept();
        } catch (Exception e) {
            System.out.println("Confirm Alert handling failed: " + e.getMessage());
        }
    }

    public void handlePromptAlert(String inputText) {
        try {
            promptAlertBtn.click();
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println("Prompt Alert Text: " + alert.getText());
            alert.sendKeys(inputText);
            alert.accept();
        } catch (Exception e) {
            System.out.println("Prompt Alert handling failed: " + e.getMessage());
        }
    }

    public void handleSweetSimpleAlert() {
        try {
            sweetSimpleAlertBtn.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-dialog-content']")));
            WebElement okBtn = driver.findElement(By.xpath("//span[text()='OK']"));
            okBtn.click();
        } catch (Exception e) {
            System.out.println("Sweet Simple Alert handling failed: " + e.getMessage());
        }
    }

    public void handleSweetConfirmAlert() {
        try {
            sweetConfirmBtn.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-dialog-content']")));
            WebElement yesBtn = driver.findElement(By.xpath("//span[text()='Yes']"));
            yesBtn.click();
        } catch (Exception e) {
            System.out.println("Sweet Confirm Alert handling failed: " + e.getMessage());
        }
    }

    public void handleSweetModalDialog() {
        try {
            sweetModalBtn.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-dialog-content']")));
            WebElement closeBtn = driver.findElement(By.xpath("//span[text()='Close']"));
            closeBtn.click();
        } catch (Exception e) {
            System.out.println("Sweet Modal Dialog handling failed: " + e.getMessage());
        }
    }

    public void handleMinimizeMaximize() {
        try {
            minimizeMaximizeBtn.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-dialog-content']")));
            WebElement minimizeBtn = driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-minimize']"));
            minimizeBtn.click();
            Thread.sleep(1000);
            WebElement maximizeBtn = driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-maximize']"));
            maximizeBtn.click();
        } catch (Exception e) {
            System.out.println("Minimize/Maximize handling failed: " + e.getMessage());
        }
    }
}



