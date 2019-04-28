package com.agonciarz;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class Stepdefs {
    AppiumDriver driver;
    private String deviceName = "nexus";
    private String appPackage = "com.android.contacts";
    private String appActivity = ".DialtactsContactsEntryActivity";
    private String platformName = "Android";

    ContactsMainPage contactsMainPage;
    CreateContactPage createContactPage;

    @Before
    public void setup() throws MalformedURLException {
        URL appiumServer = new URL("http://0.0.0.0:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, appPackage);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appActivity);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);

        driver = new AndroidDriver(appiumServer, capabilities);

        contactsMainPage = new ContactsMainPage(driver);
        createContactPage = new CreateContactPage(driver);
    }

    @After
    public void teardown() {
        driver.quit();
    }


    @Given("I open contacts")
    public void i_open_contacts() {
    }

    @When("I click create new contact button")
    public void i_click_create_new_contact_button() {
        contactsMainPage.createContactButton.click();
    }

    @Then("alert should be displayed")
    public void alert_should_be_displayed() {
        assert createContactPage.addAccountButton.isDisplayed();
    }
}
