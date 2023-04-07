package Pages;

import org.openqa.selenium.WebDriver;

public class WinjObj {

    private WinjLoginPage winjLoginPage;
    private WinjHomePage winjHomePage;
    private WebDriver driver;

        public WinjObj(WebDriver driver){
            this.driver = driver;
        }

        public WinjLoginPage getWinjLoginPage() {

            if (winjLoginPage == null){
                winjLoginPage = new WinjLoginPage(driver);}
            return winjLoginPage;
        }

    public WinjHomePage getWinjHomePage() {

        if (winjHomePage == null){
            winjHomePage = new WinjHomePage(driver);}
        return winjHomePage;
    }



}

