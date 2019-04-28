package com.agonciarz;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsMainPage {
    AppiumDriver driver;

    @FindBy(id = "floating_action_button")
    public WebElement createContactButton;


    public ContactsMainPage(AppiumDriver myDriver) {
        this.driver = myDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


}
