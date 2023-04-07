package Pages;

import Utilities.WebPageBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;


public class WinjHomePage extends WebPageBase {


    public WinjHomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "btnMyCoursesListMobile")
    public WebElement coursesIcon;

    @FindBy(id = "btnListAddCourse")
    public WebElement createCourseButton;

    @FindBy(id = "txtCourseName")
    public WebElement createCourseName;

    @FindBy(id = "courseSubject")
    public WebElement selectSubject;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/div/div/div/div/div/div/div/div/div/form/div/fieldset/div[4]/div[2]/div[2]/div/div/select")
    public WebElement chooseSubject;

    @FindBy(id = "courseGrade")
    public WebElement courseGrade;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/div/div/div/div/div/div/div/div/div/form/div/fieldset/div[4]/div[2]/div[3]/div[1]/select")
    public WebElement chooseGradeYear;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/div/div/div/div/div/div/div/div/div/form/div/fieldset/div[4]/div[2]/div[4]/div[3]/div[1]/div/div[1]/span/i")
    public WebElement selectCourseTeacher;

    @FindBy(id = "lnkCourseOwnerMail")
    public WebElement chooseCourseTeacher;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/div/div/div/div/div/div/div/div/div/form/div/fieldset/div[4]/div[2]/div[5]/div[2]/div/label/em")
    public WebElement chooseFinalAssessment;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/div/div/div/div/div/div/div/div/div/form/div/fieldset/div[5]/div[1]/em")
    public WebElement selectCourseSetting;

    @FindBy(name = "courseCapacity")
    public WebElement courseCapacity;

    @FindBy(id = "txtCourseLocationName")
    public WebElement setCourseLocation;


    @FindBy(id = "chkEnableLearningPath")
    public WebElement chkEnableLearningPath;

    @FindBy(id = "lblQuizAchievementCoverageType")
    public WebElement studentLearningObjectiveAchievementSettings;

    @FindBy(id = "btnSaveAsDraftCourse")
    public WebElement saveCourseButton;

    @FindBy(className = "toast-message")
    public WebElement courseCreatedSuccessfully;


    public void clickOnCoursesIcon(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", coursesIcon);
    }

    public void clickOnCreateCourseButton() {

        createCourseButton.click();
    }

    public void createCourseName(String CourseName) {
        createCourseName.sendKeys(CourseName);
    }

    public void selectSubject() {
        selectSubject.click();
    }

    public void chooseSubject(WebDriver driver) throws InterruptedException {
        Select select = new Select(chooseSubject);
        select.selectByIndex(10);
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();


    }

    public void selectCourseGrade() {
        courseGrade.click();
    }

    public void chooseGradeYear() {
        Select select = new Select(chooseGradeYear);
        select.selectByIndex(13);
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
    }

    public void selectCourseTeacher() {
        selectCourseTeacher.click();
    }

    public void chooseCourseTeacher() {
        chooseCourseTeacher.click();
    }

    public void chooseFinalAssessment() {

            chooseFinalAssessment.click();

    }

    public void selectCourseSetting(WebDriver driver) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", selectCourseSetting);
        }



        public void chooseCourseCapacity (String Capacity) throws InterruptedException {
            courseCapacity.sendKeys(Capacity);
        }

        public void setCourseLocation(String Location){
            setCourseLocation.sendKeys(Location);
        }

        public void chkEnableLearningPath(WebDriver driver){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", chkEnableLearningPath);
        }

        public void studentLearningObjectiveAchievementSettings(WebDriver driver){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", studentLearningObjectiveAchievementSettings);

        }


        public void saveCourseButton(WebDriver driver){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", saveCourseButton);
        }
        public void assertCourseCreatedSuccessfully() throws InterruptedException {
            Thread.sleep(3000);
            Thread.sleep(1000);
            SoftAssert softAssert = new SoftAssert();
            String ExpectedText = "Course is added successfully.";
            String ActualText = courseCreatedSuccessfully.getText();
            softAssert.assertEquals(ActualText,ExpectedText,"Title is not Matching");
            softAssert.assertAll();

        }

        }