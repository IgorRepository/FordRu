package comFordRu.TestRun;

import comFordRu.BaseClass.BaseTest;
import comFordRu.Pages.Fiesta;
import comFordRu.Pages.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by 1 on 09.06.2018.
 */
public class FiestaTabDesignTest extends BaseTest {



    @Test
    public void fiestaOverViewTabOpened() throws Exception {
        Header header = new Header(driver,log);
        header.goToFiestaPageViaHeaderMainPage();
        Fiesta fiesta = new Fiesta(driver, log);
        Assert.assertTrue(fiesta.fiestaOverViewTabOpened());
    }

    @Test
    public void fiestaTabDesignTabOpened() throws Exception {
        Header header = new Header(driver, log);
        Fiesta fiesta = new Fiesta(driver, log);
        header.goToFiestaPageViaHeaderMainPage()
                .goToTabDesign();
        Assert.assertTrue(fiesta.fiestaDesignTabBodyOfCarIsOpened());
    }

    @Test
    public void fiestaTabDesignTabInteriorOpened() throws Exception {
        Header header = new Header(driver, log);
        Fiesta fiesta = new Fiesta(driver, log);
        header.goToFiestaPageViaHeaderMainPage()
                .goToTabDesignTabInterior();
        Assert.assertTrue(fiesta.fiestaTabDesignTabInteriorIsOpened());
    }

    @Test
    public void fiestaTabDesignTabAllowWheelsOpened() throws Exception {
        Header header = new Header(driver, log);
        Fiesta fiesta = new Fiesta(driver, log);
        header.goToFiestaPageViaHeaderMainPage()
                .goToTabDesignTabAllowWheels();
        Assert.assertTrue(fiesta.fiestaTabDesignTabAllowWheelsIsOpened());
    }

    @Test
    public void fiestaTabDesignTabColorOfBodyCarIsOpened() throws Exception {
        Header header = new Header(driver, log);
        Fiesta fiesta = new Fiesta(driver, log);
        header.goToFiestaPageViaHeaderMainPage()
                .goToTabDesignTabColorOfBodyCar();
        Assert.assertTrue(fiesta.fiestaTabDesignTabColorOfBodyCarOpened());
    }

    @Test
    public void fiestaTabDesignTabAccessoriesIsOpened() throws Exception {
        Header header = new Header(driver, log);
        Fiesta fiesta = new Fiesta(driver, log);
        header.goToFiestaPageViaHeaderMainPage()
                .goToTabDesignTabAccessories();
        Assert.assertTrue(fiesta.fiestaTabDesignTabAccessoriesOpened());

    }


}
