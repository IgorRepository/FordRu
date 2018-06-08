package comFordRu.Pages;

import comFordRu.BaseClass.BasePageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by 1 on 09.06.2018.
 */
public class TabsOnPassengerCarPage extends BasePageObject<TabsOnPassengerCarPage> {

    public TabsOnPassengerCarPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private By tabOverView = By.xpath("//a[@href='#primary-tab-content0' and contains (@tabindex, '0')]");

    private By tabDesign = By.xpath("//a[@id='linkprimary-tab-content1' and contains (@tabindex, '1')]");
    private By tabDesignTabBodyOfCar = By.xpath("//a[@id='linkprimary-tab-content00' and contains (text(), \"Внешний вид\")]");
    private By tabDesignTabInterior = By.xpath("//a[@rel='primary-tab-content01' and contains (@tabindex, '1')]");
    private By tabDesignTabAllowWheels = By.xpath("//a[@id='linkprimary-tab-content02' and contains (@tabindex, '2')]");
    private By tabDesignTabColorOfBodyCar = By.xpath("//a[@id='linkprimary-tab-content03' and contains (@tabindex, '3')]");
    private By tabDesignTabAccessories = By.xpath("//a[@id='linkprimary-tab-content04' and contains (@tabindex, '4')]");


    private By tabTechnology = By.xpath("//a[@id='linkprimary-tab-content2' and contains (@tabindex, '2')]");
    private By tabSpecification = By.xpath("//a[@id='linkprimary-tab-content3' and contains (@tabindex, '3')]");
    private By tabPrice = By.xpath("//a[@id='linkprimary-tab-content4' and contains (@tabindex, '4')]");
    private By tabWhiteAndBlack = By.xpath("//a[@id='linkprimary-tab-content5' and contains (@tabindex, '5')]");

    public void goToTabDesign() {
        waitVisibilityOf(tabDesign);
        click(tabDesign);
    }

    public void goToTabDesignTabBodyOfCarDefaultDisplayed() {
        goToTabDesign();
        waitVisibilityOf(tabDesignTabBodyOfCar);
        click(tabDesignTabBodyOfCar);
    }

    public void goToTabDesignTabInterior() {
        goToTabDesign();
        waitVisibilityOf(tabDesignTabInterior);
        click(tabDesignTabInterior);
    }

    public void goToTabDesignTabAllowWheels() {
        goToTabDesign();
        waitVisibilityOf(tabDesignTabAllowWheels);
        click(tabDesignTabAllowWheels);
    }

    public void goToTabDesignTabColorOfBodyCar() {
        goToTabDesign();
        waitVisibilityOf(tabDesignTabColorOfBodyCar);
        click(tabDesignTabColorOfBodyCar);
    }

    public void goToTabDesignTabAccessories() {
        goToTabDesign();
        waitVisibilityOf(tabDesignTabAccessories);
        click(tabDesignTabAccessories);
    }
}
