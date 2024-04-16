package bdd.webdriver;

import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.UUID;

public class DOM {

    static String screenShotDir="C:\\Users\\viann\\Proyecto_Jumbo\\src\\test\\resources\\evidencias";

    public static WebDriver webDriver(){
        return WebDriverFactory.getWebDriver();
    }

    public DOM(){
        PageFactory.initElements(webDriver(), this);
    }

    public void initializeBrowser(String url){
        webDriver().get(url);
        webDriver().manage().window().maximize();
    }

    public static void waitVisibilityOfElement(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(webDriver(), Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitClikeableElement(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(webDriver(), Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void implicitWaitOfElement( int timeoutInSeconds) {
        webDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutInSeconds));
    }

    public static void pressEnterKey() {
        Actions actions = new Actions(webDriver());
        actions.keyDown(Keys.ENTER).perform();
        actions.keyUp(Keys.ENTER).perform();
    }

    public static void scrollToCoordinates(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver();
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
    }


    public void onclick(WebElement element){
        element.click();
    }

    public void type(WebElement element, String text) {element.sendKeys(text);}

    public String getText(WebElement element){
        return element.getText();
    }


    public void takeScreenShot(Scenario scenario){
        try {
            String screenshotName = "screenshot_" + UUID.randomUUID() + ".png";
            final byte[] screenshot = ((TakesScreenshot) webDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", screenshotName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



public void quitDriver(){
        webDriver().quit();
}

}
