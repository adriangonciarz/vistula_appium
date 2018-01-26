import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleCalculatorPage {
    @AndroidFindBy(id = "digit_9")
    public WebElement digit_9;
    @AndroidFindBy(id = "digit_8")
    public WebElement digit_8;
    @AndroidFindBy(id = "digit_7")
    public WebElement digit_7;
    @AndroidFindBy(id = "digit_6")
    public WebElement digit_6;
    @AndroidFindBy(id = "digit_5")
    public WebElement digit_5;
    @AndroidFindBy(id = "digit_4")
    public WebElement digit_4;
    @AndroidFindBy(id = "digit_3")
    public WebElement digit_3;
    @AndroidFindBy(id = "digit_2")
    public WebElement digit_2;
    @AndroidFindBy(id = "digit_1")
    public WebElement digit_1;
    @AndroidFindBy(id = "digit_0")
    public WebElement digit_0;

    @AndroidFindBy(id = "plus")
    public WebElement plus;
    @AndroidFindBy(id = "minus")
    public WebElement minus;
    @AndroidFindBy(id = "times")
    public WebElement times;
    @AndroidFindBy(id = "op_div")
    public WebElement divide;

    @AndroidFindBy(id = "del")
    public WebElement delete;
    @AndroidFindBy(id = "equals")
    public WebElement equals;
    @AndroidFindBy(id = "dec_point")
    public WebElement decimal;

    @AndroidFindBy(id = "formula")
    public WebElement formula;
    @AndroidFindBy(id = "result")
    public WebElement result;

    public void tap(int digit) {
        WebElement elementToTap;
        switch (digit) {
            case 0:
                elementToTap = digit_0;
                break;
            case 1:
                elementToTap = digit_1;
                break;
            case 2:
                elementToTap = digit_2;
                break;
            case 3:
                elementToTap = digit_3;
                break;
            case 4:
                elementToTap = digit_4;
                break;
            case 5:
                elementToTap = digit_5;
                break;
            case 6:
                elementToTap = digit_6;
                break;
            case 7:
                elementToTap = digit_7;
                break;
            case 8:
                elementToTap = digit_8;
                break;
            case 9:
                elementToTap = digit_9;
                break;
            default:
                elementToTap = equals;
                break;
        }
        elementToTap.click();
    }
}