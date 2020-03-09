package com.kolotilkin.infrastructure.wdm.factory;

import com.kolotilkin.infrastructure.wdm.enums.WebDriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LocalWebDriverFactory implements WebDriverFactory {

    @Override
    public WebDriver create(String type) {

        switch (WebDriverType.valueOf(type.toUpperCase())) {
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
            case EDGE:
                return new EdgeDriver();
            case SAFARI:
                return new SafariDriver();
            default:
                throw new RuntimeException("Such webDriver type is not supported");
        }
    }
}
