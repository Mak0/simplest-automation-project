package com.kolotilkin.infrastructure.wdm.factory;

import org.openqa.selenium.WebDriver;

public interface WebDriverFactory {

    WebDriver create(String type);
}
