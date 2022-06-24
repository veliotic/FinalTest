package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement buttons;
    WebElement links;
    WebElement brokenLinksImages;
    WebElement uploadAndDownload;


    public SidebarPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.id("item-1"));
    }

    public WebElement getWebTables() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]/svg"));
    }

    //----------------------
    public void clickOnCheckBoxButton(){
        this.getCheckBox().click();
    }

    public void clickOnWebTablesButton(){
        this.getWebTables().click();
    }
}