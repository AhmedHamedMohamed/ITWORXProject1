package Pages;

import Utilities.WebPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WinjLoginPage extends WebPageBase {


        public WinjLoginPage(WebDriver driver) {
            super(driver);
        }


        @FindBy(id = "Email")
        public WebElement loginUserName;

        @FindBy (id = "inputPassword")
        public WebElement loginPassword;

        @FindBy (id = "btnLogin")
        public WebElement loginButton;




        public void loginUserName(String Name) {

            loginUserName.sendKeys(Name);
        }

        public void loginPassword(String password) {

            loginPassword.sendKeys(password);
        }


        public void loginButton() throws InterruptedException {

            loginButton.click();
        }
    }


