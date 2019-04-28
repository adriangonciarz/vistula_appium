package com.agonciarz;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateContactPage {
    AppiumDriver driver;
    @AndroidFindBy(xpath="//android.widget.EditText[@text='First name']")
    WebElement firstName;
    @AndroidFindBy(xpath="//android.widget.EditText[@text='Last name']")
    WebElement lastName;
    @AndroidFindBy(xpath="//android.widget.EditText[@text='Phone']")
    WebElement phone;
    @AndroidFindBy(xpath = "//android.widget.Spinner")
    Select phoneTypeSelect;
    @AndroidFindBy(id="editor_menu_save_button")
    WebElement saveButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='ADD ACCOUNT']")
    WebElement addAccountButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    WebElement cancelButton;

    public CreateContactPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void createContact(String fName, String lName){
        lastName.click();
        lastName.sendKeys(lName);
        firstName.click();
        firstName.sendKeys(fName);
        phone.click();
        phone.sendKeys("4132423423");
        phoneTypeSelect.selectByIndex(2);
        saveButton.click();
    }

    public void closeAlertIfDisplayed(){
        if (addAccountButton.isDisplayed()){
            cancelButton.click();
        }
    }
}
