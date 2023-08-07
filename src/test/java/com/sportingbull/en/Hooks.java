package com.sportingbull.en;

import com.cucumber.listener.Reporter;
import com.sportingbull.en.propertyReader.PropertyReader;
import com.sportingbull.en.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utility
{
    @Before
    public void setup()
    {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario)
    {
        if(scenario.isFailed())
        {
            String screenshotPath = Utility.getScreenshot(driver,scenario.getName().replace("","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenshotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
       // closeBrowser();
    }


}
