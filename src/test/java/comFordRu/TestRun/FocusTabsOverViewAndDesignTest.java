package comFordRu.TestRun;

import comFordRu.BaseClass.BaseTest;
import comFordRu.Pages.Focus;
import comFordRu.Pages.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by 1 on 06.06.2018.
 */
public class FocusTabsOverViewAndDesignTest extends BaseTest {



    @Test
    public void focusOverViewTabOpened() throws Exception {
        Header header = new Header(driver,log);
        header.goToFocusPageViaHeaderMainPage();
        Focus focus = new Focus(driver, log);
        Assert.assertTrue(focus.focusOverViewTabOpened());
    }

    @Test
    public void focusDesignTabOpened() throws Exception {
        Header header = new Header(driver, log);
        Focus focus = new Focus(driver, log);
        header.goToFocusPageViaHeaderMainPage()
                .goToTabDesign();
        Assert.assertTrue(focus.focusDesignTabBodyOfCarIsOpened());
    }

    @Test
    public void focusTabDesignTabInteriorOpened() throws Exception {
        Header header = new Header(driver, log);
        Focus focus = new Focus(driver, log);
        header.goToFocusPageViaHeaderMainPage()
                .goToTabDesignTabInterior();
        Assert.assertTrue(focus.focusTabDesignTabInteriorIsOpened());
    }

    @Test
    public void focusTabDesignTabAllowWheelsOpened() throws Exception {
        Header header = new Header(driver, log);
        Focus focus = new Focus(driver, log);
        header.goToFocusPageViaHeaderMainPage()
                .goToTabDesignTabAllowWheels();
        Assert.assertTrue(focus.focusTabDesignTabAllowWheelsIsOpened());
    }

    @Test
    public void focusTabDesignTabColorOfBodyCarIsOpened() throws Exception {
        Header header = new Header(driver, log);
        Focus focus = new Focus(driver, log);
        header.goToFocusPageViaHeaderMainPage()
                .goToTabDesignTabColorOfBodyCar();
        Assert.assertTrue(focus.focusTabDesignTabColorOfBodyCarOpened());
    }

    @Test
    public void focusTabDesignTabAccessoriesIsOpened() throws Exception {
        Header header = new Header(driver, log);
        Focus focus = new Focus(driver, log);
        header.goToFocusPageViaHeaderMainPage()
                .goToTabDesignTabAccessories();
        Assert.assertTrue(focus.focusTabDesignTabAccessoriesOpened());

    }
}
