package comFordRu.Pages;

import comFordRu.BaseClass.BasePageObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by 1 on 06.06.2018.
 */
public class Header extends BasePageObject<Header> {

    private WebElement headerPopUpAvtomobili = find(By.xpath("//a[@href='/Cars' and contains (@class, 'mainTopNav om_he_pv_li')]"));
    private By headerBtnFocus = By.xpath("//a[@tabindex='1' and contains (@id, 'linkinnerWrap1')]");
    private By headerBtnFiesta = By.xpath("//a[@tabindex='0' and contains (@id, 'linkinnerWrap0')]");

    public Header(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public TabsOnPassengerCarPage goToFocusPageViaHeaderMainPage() {
        mouseOver(headerPopUpAvtomobili);
        click(headerBtnFocus);
        return new TabsOnPassengerCarPage(driver, log);
    }

    public TabsOnPassengerCarPage goToFiestaPageViaHeaderMainPage() {
        mouseOver(headerPopUpAvtomobili);
        click(headerBtnFiesta);
        return new TabsOnPassengerCarPage(driver, log);
    }

}
