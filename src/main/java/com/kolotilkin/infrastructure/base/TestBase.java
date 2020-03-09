package com.kolotilkin.infrastructure.base;


import com.kolotilkin.infrastructure.config.ConfigurationManager;
import com.kolotilkin.infrastructure.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public class TestBase {

    private WebDriverManager wdm = new WebDriverManager();
    protected WebDriver webDriver;

    @Before
    public void setUp() {

        webDriver = wdm.getWebDriver(ConfigurationManager.getInstance().getWebDriverRunOn(),
                ConfigurationManager.getInstance().getWebDriverType());

        beforeTest();
    }

    @After
    public void cleanUP() {
        afterTest();

        wdm.destroy(webDriver);
    }

    protected void beforeTest() {
    }

    protected void afterTest() {
    }
}
