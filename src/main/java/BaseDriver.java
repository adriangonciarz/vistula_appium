import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseDriver {
    public AppiumDriver<WebElement> driver;

    @Before
    public void setUp() throws Exception {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "nexus5");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        capabilities.setCapability("platformVersion", "6.0");

        driver = new AndroidDriver<>(url, capabilities);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}