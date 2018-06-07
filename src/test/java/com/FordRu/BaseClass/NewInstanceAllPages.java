package com.FordRu.BaseClass;

import com.FordRu.Pages.Focus;
import com.FordRu.Pages.Header;

/**
 * Created by 1 on 07.06.2018.
 */
public class NewInstanceAllPages extends BaseTest {

    protected Header header = new Header(driver, log);
    protected Focus focus = new Focus(driver, log);

    public Header getHeader() {
        return header;
    }

    public Focus getFocus() { return focus; }
}
