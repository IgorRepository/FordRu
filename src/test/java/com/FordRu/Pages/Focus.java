package com.FordRu.Pages;

import com.FordRu.BaseClass.BasePageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by 1 on 06.06.2018.
 */
public class Focus extends BasePageObject<Focus> {

    private By focusTabOverView = By.xpath("//a[@href='#primary-tab-content0' and contains (@tabindex, '0')]");

    private By focusTabDesign = By.xpath("//a[@id='linkprimary-tab-content1' and contains (@tabindex, '1')]");
    private By focusTabDesignTabBodyOfCar = By.xpath("//a[@id='linkprimary-tab-content00' and contains (text(), \"Внешний вид\")]");
    private By focusTabDesignTabInterior = By.xpath("//a[@id='linkprimary-tab-content1' and contains (@tabindex, '1')]");
    private By focusTabDesignTabAllowWheel = By.xpath("//a[@id='linkprimary-tab-content1' and contains (@tabindex, '1')]");
    private By focusTabDesignTabColorOfBodyCar = By.xpath("//a[@id='linkprimary-tab-content1' and contains (@tabindex, '1')]");
    private By focusTabDesignTabAccessories = By.xpath("//a[@id='linkprimary-tab-content1' and contains (@tabindex, '1')]");
    private By focusTabDesignTabBodyOfCarAllTextOnPageExist = By.xpath("//div[@id='primary-tab-content00']");


    private By focusTabTechnology = By.xpath("//a[@id='linkprimary-tab-content2' and contains (@tabindex, '2')]");
    private By focusTabSpecification = By.xpath("//a[@id='linkprimary-tab-content3' and contains (@tabindex, '3')]");
    private By focusTabPrice = By.xpath("//a[@id='linkprimary-tab-content4' and contains (@tabindex, '4')]");
    private By focusTabWhiteAndBlack = By.xpath("//a[@id='linkprimary-tab-content5' and contains (@tabindex, '5')]");
    private By h1TitleOverViewSliderExist = By.xpath("//div[@class='js-smart-header-container intro-header']");

    public Focus(WebDriver driver, Logger log) {
        super(driver, log);
    }


    public boolean focusOverViewTabOpened() {
        waitVisibilityOf(h1TitleOverViewSliderExist,15);
        return find(h1TitleOverViewSliderExist).isDisplayed();
    }

    public boolean focusDesignTabBodyOfCarOpened() {
        return find(focusTabDesignTabBodyOfCarAllTextOnPageExist).isDisplayed();
    }

    public void goToTabDesignTabBodyOfCar() {
        click(focusTabDesign);
    }
}
