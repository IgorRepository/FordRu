package comFordRu.Pages;

import comFordRu.BaseClass.BasePageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by 1 on 06.06.2018.
 */
public class Fiesta extends BasePageObject<Fiesta> {

    private By expectedFiestaOverViewSliderExist = By.xpath("//img[@alt='Ford Fiesta']");
    private By expectedFiestaFotoTabDesignTabBodyOfCarExist = By.xpath("//img[@alt=' ']");
    private By expectedFiestaFotoTabDesignTabInteriorExist = By.xpath("//img[@alt='Кнопка запуска двигателя Ford Power']");
    private By expectedFiestaFotoTabDesignTabColorOfBodyCarExist = By.xpath("//img[@alt='Цветовые решения для Ford Fiesta']");
    private By expectedFiestaFotoTabDesignTabAllowWheelsExist = By.xpath("//img[@alt='16” 12-спицевые литые диски (аксессуар)']");
    private By expectedFiestaFotoTabDesignTabAccessoriesExist = By.xpath("//img[@alt='Стиль']");


    public Fiesta(WebDriver driver, Logger log) {
        super(driver, log);
    }


    public boolean fiestaOverViewTabOpened() {
        waitVisibilityOf(expectedFiestaOverViewSliderExist);
        return find(expectedFiestaOverViewSliderExist).isDisplayed();
    }


    public boolean fiestaDesignTabBodyOfCarIsOpened() {
        waitVisibilityOf(expectedFiestaFotoTabDesignTabBodyOfCarExist);
        return find(expectedFiestaFotoTabDesignTabBodyOfCarExist).isDisplayed();
    }


    public boolean fiestaTabDesignTabInteriorIsOpened() {
        waitVisibilityOf(expectedFiestaFotoTabDesignTabInteriorExist);
        return find(expectedFiestaFotoTabDesignTabInteriorExist).isDisplayed();
    }

    public boolean fiestaTabDesignTabAllowWheelsIsOpened() {
        waitVisibilityOf(expectedFiestaFotoTabDesignTabAllowWheelsExist);
        return find(expectedFiestaFotoTabDesignTabAllowWheelsExist).isDisplayed();
    }

    public boolean fiestaTabDesignTabColorOfBodyCarOpened() {
        waitVisibilityOf(expectedFiestaFotoTabDesignTabColorOfBodyCarExist);
        return find(expectedFiestaFotoTabDesignTabColorOfBodyCarExist).isDisplayed();
    }


    public boolean fiestaTabDesignTabAccessoriesOpened() {
        waitVisibilityOf(expectedFiestaFotoTabDesignTabAccessoriesExist);
        return find(expectedFiestaFotoTabDesignTabAccessoriesExist).isDisplayed();
    }
}
