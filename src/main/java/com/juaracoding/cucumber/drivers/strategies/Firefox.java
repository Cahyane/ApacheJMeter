package com.juaracoding.cucumber.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  Firefox implements DriverStrategy {
        @Override
        public WebDriver setStrategy() {
            System.setProperty("webdriver.chrome.driver", "C:\\juaracooding\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            return driver;
        }
    }
