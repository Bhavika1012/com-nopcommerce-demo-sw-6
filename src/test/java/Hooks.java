package com.nopcommerce;

import com.cucumber.listener.Reporter;
import com.nopcommerce.propertyreader.PropertyReader;
import com.nopcommerce.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


//Hook responsible for opening and closing browser
public class Hooks extends Utility {
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShortPath = Utility.getScreenshot(driver, scenario.getName().replace("", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShortPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();
    }
}
