package comFordRu.BaseClass;

import comFordRu.Pages.Header;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by 1 on 09.05.2018.
 */
public class BasePageObject<T> {

    protected Actions action;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Logger log;

    public BasePageObject(WebDriver driver, Logger log) {
        this.driver = driver;
        this.log = log;
        wait = new WebDriverWait(driver, 200);
        action = new Actions(driver);
    }

    public Header getHeader() {
        return new Header(driver, log);
    }


    protected T getPage(String url) {
        driver.get(url);
        return (T) this;
    }

    protected void type(String text, By element) {
        find(element).sendKeys(text);
    }

    protected void click(By element) {
        find(element).click();
    }

    protected void mouseOver(WebElement element) {
        action.moveToElement(element).perform();
    }

    protected WebElement find(By element) {
        return driver.findElement(element);
    }

    protected void waitVisibilityOf(By locator, Integer... timeInSecond) {
        try {
            waitFor(ExpectedConditions.visibilityOfElementLocated(locator), (timeInSecond.length > 0 ? timeInSecond[0] : null));
        } catch (StaleElementReferenceException e) {
        }
    }

    private void waitFor(ExpectedCondition<WebElement> condition, Integer timeInSeconds) {
        timeInSeconds = timeInSeconds !=null ? timeInSeconds : 20;
        WebDriverWait wait = new WebDriverWait(driver,timeInSeconds);
        wait.until(condition);
    }

}

