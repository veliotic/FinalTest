package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownloadPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement downloadButton;


    public UploadAndDownloadPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getDownloadButton() {
        return driver.findElement(By.id("downloadButton"));
    }

    public void clickOnDownloadButton(){
        this.getDownloadButton().click();
    }
}
