package comFordRu.Pages;

import comFordRu.BaseClass.BasePageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by 1 on 06.06.2018.
 */
public class Focus extends BasePageObject<Focus> {

    private By expectedFocusOverViewSliderExist = By.xpath("//div[@class='js-smart-header-container intro-header']");
    private By expectedFocusFotoTabDesignTabBodyOfCarExist = By.xpath("//img[@alt='фото Focus 3 в кузове седан модельный год 2016/2017']");
    private By expectedFocusFotoTabDesignTabInteriorExist = By.xpath("//img[@alt='фото салона Форд фокус 3 рестайлинг 2016']");
    private By expectedFocusFotoTabDesignTabAllowWheelsExist = By.xpath("//img[@alt='стальные диски на Форд Фокус с декоративными колпаками']");
    private By expectedFocusFotoTabDesignTabColorOfBodyCarExist = By.xpath("//img[@alt='Форд Фокус темно-синий']");
    private By expectedFocusFotoTabDesignTabAccessoriesExist = By.xpath("//img[@alt='Стиль']");


    public Focus(WebDriver driver, Logger log) {
        super(driver, log);
    }


    public boolean focusOverViewTabOpened() {
        waitVisibilityOf(expectedFocusOverViewSliderExist);
        return find(expectedFocusOverViewSliderExist).isDisplayed();
    }


    public boolean focusDesignTabBodyOfCarIsOpened() {
        waitVisibilityOf(expectedFocusFotoTabDesignTabBodyOfCarExist);
        return find(expectedFocusFotoTabDesignTabBodyOfCarExist).isDisplayed();
    }


    public boolean focusTabDesignTabInteriorIsOpened() {
        waitVisibilityOf(expectedFocusFotoTabDesignTabInteriorExist);
        return find(expectedFocusFotoTabDesignTabInteriorExist).isDisplayed();
    }

    public boolean focusTabDesignTabAllowWheelsIsOpened() {
        waitVisibilityOf(expectedFocusFotoTabDesignTabAllowWheelsExist);
        return find(expectedFocusFotoTabDesignTabAllowWheelsExist).isDisplayed();
    }

    public boolean focusTabDesignTabColorOfBodyCarOpened() {
        waitVisibilityOf(expectedFocusFotoTabDesignTabColorOfBodyCarExist);
        return find(expectedFocusFotoTabDesignTabColorOfBodyCarExist).isDisplayed();
    }


    public boolean focusTabDesignTabAccessoriesOpened() {
        waitVisibilityOf(expectedFocusFotoTabDesignTabAccessoriesExist);
        return find(expectedFocusFotoTabDesignTabAccessoriesExist).isDisplayed();
    }
}
