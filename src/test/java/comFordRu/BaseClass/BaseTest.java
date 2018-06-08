package comFordRu.BaseClass;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Created by 1 on 08.05.2018.
 */
public class BaseTest {

    protected WebDriver driver;
    protected Logger log;

    @BeforeClass()
    protected void setUp(ITestContext ctx) {
        String testName = ctx.getCurrentXmlTest().getName();
        log = Logger.getLogger(testName);
    }

    @BeforeMethod()
    protected void setUpMethod() {
        log.info("ChromeStartWork");
        driver = new ChromeDriver();
        driver.get("http://www.ford.ru/");
    }

    @AfterMethod()
    public void quit() {
        driver.quit();
    }
}
