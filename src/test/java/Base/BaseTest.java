package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public JavascriptExecutor js;
    public Homepage homePage;
    public SidebarPage sidebarPage;
    public CheckboxPage checkboxPage;
    public WebtablesPage webtablesPage;
    public TextboxPage textboxPage;
    public ButtonsPage buttonsPage;
    public RadioButtonPage radioButtonPage;
    public LinksPage linksPage;
    public UploadAndDownloadPage uploadAndDownloadPage;


    @BeforeClass
    public void Setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new Homepage(driver, wdwait);
        sidebarPage = new SidebarPage(driver, wdwait);
        checkboxPage = new CheckboxPage(driver, wdwait);
        webtablesPage = new WebtablesPage(driver, wdwait);
        textboxPage=new TextboxPage(driver, wdwait);
        buttonsPage=new ButtonsPage(driver, wdwait);
        radioButtonPage= new RadioButtonPage(driver, wdwait);
        linksPage=new LinksPage(driver, wdwait);
        uploadAndDownloadPage=new UploadAndDownloadPage(driver, wdwait);

        js = (JavascriptExecutor) driver;
    }


    public void VisibilitWait(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void Scroll(WebElement element){
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @AfterClass
    public void TearDown(){
      //  driver.close();
      //  driver.quit();
    }
}