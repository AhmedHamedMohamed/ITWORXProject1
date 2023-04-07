package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

public class WebPageBase {


    public WebDriver driver;
    public JavascriptExecutor jse ;
    Logger logger = Logger.getLogger(WebPageBase.class);
    static int timeinSec=30;

    // create constructor
    public WebPageBase(WebDriver driver)
    {
        PageFactory
                .initElements(driver, this);
        this.driver =driver;
    }

    public  void waitUntilElementLocated(int time,WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public  void setTextElementText(WebElement textElement , String value)
    {	waitUntilElementLocated( 25,textElement);
        textElement.sendKeys(value);
    }

}
