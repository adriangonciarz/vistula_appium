import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AdvancedCalculatorPage extends SimpleCalculatorPage {
    @AndroidFindBy(id="fun_sin")
    public WebElement sinus;
    @AndroidFindBy(id="const_pi")
    public WebElement pi;


}
