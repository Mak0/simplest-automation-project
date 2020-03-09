package com.kolotilkin.infrastructure.wdm;

import com.kolotilkin.infrastructure.wdm.enums.RunOn;
import com.kolotilkin.infrastructure.wdm.factory.LocalWebDriverFactory;
import com.kolotilkin.infrastructure.wdm.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class WebDriverManager {

    public WebDriver getWebDriver(String runOnType, String webDriverType) {
        WebDriverFactory factory;

        switch(RunOn.valueOf(runOnType)) {
            case LOCAL:
                factory = new LocalWebDriverFactory();
                break;
            case REMOTE:
                throw new NotImplementedException();
            case CLOUD:
                throw new NotImplementedException();
            default:
                throw new RuntimeException("Unsupported run on options");
        }

        return factory.create(webDriverType);
    }
}
