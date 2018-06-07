package com.FordRu.TestRun;

import com.FordRu.BaseClass.NewInstanceAllPages;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by 1 on 06.06.2018.
 */
public class AllTabsFordFocusTest extends NewInstanceAllPages {


    @Test
    public void focusOverViewTabOpened() throws Exception {
        getHeader().goToFocusPageViaHeaderMainPage();
        Assert.assertTrue(getFocus().focusOverViewTabOpened());
    }

//    @Test
//    public void focusDesignTabOpened() throws Exception {
//        getHeader().goToFocusPageViaHeaderMainPage();
//        getFocus().goToTabDesignTabBodyOfCar();
//        Assert.assertTrue(getFocus().focusDesignTabBodyOfCarOpened());
//    }
}
