package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextboxPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;

    public TextboxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.xpath("//*[@id='currentAddress']"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.xpath("//*[@id='permanentAddress']"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    //------------------------------

    public void clickOnFullName(){
        this.getFullName().click();
    }
    public void insertName(){
        this.getFullName().sendKeys("Vlajko moj");
    }
    public void clickOnEmail(){
        this.getEmail().click();
    }
    public void insertEmail(){
this.getEmail().sendKeys("vvv@vvv.co");
    }
    public void clickOnCurrentAddress(){
        this.getCurrentAddress().click();
    }

    public void insertCurrentAddress(){
        this.getCurrentAddress().sendKeys("zivim skromno");
    }

    public void clickOnPermanentAddress(){
        this.getPermanentAddress().click();
    }

    public void insertPermanentAddress(){
        this.getPermanentAddress().sendKeys("Vrlo skromno");
    }
    public void clickOnSubmitButton(){
        this.getSubmitButton().click();
    }

}
