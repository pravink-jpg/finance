package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.AlertPage;

public class AlertTests {

    WebDriver driver;
    AlertPage alertPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/alert.xhtml");
        alertPage = new AlertPage(driver);
    }

    @Test(priority = 1)
    public void testSimpleAlert() {
        alertPage.handleSimpleAlert();
    }

    @Test(priority = 2)
    public void testConfirmAlert() {
        alertPage.handleConfirmAlert();
    }

    @Test(priority = 3)
    public void testPromptAlert() {
        alertPage.handlePromptAlert("TestLeaf User");
    }

    @Test(priority = 4)
    public void testSweetSimpleAlert() {
        alertPage.handleSweetSimpleAlert();
    }

    @Test(priority = 5)
    public void testSweetConfirmAlert() {
        alertPage.handleSweetConfirmAlert();
    }

    @Test(priority = 6)
    public void testSweetModalDialog() {
        alertPage.handleSweetModalDialog();
    }

    @Test(priority = 7)
    public void testMinimizeMaximize() {
        alertPage.handleMinimizeMaximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}