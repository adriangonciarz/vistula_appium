import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AdvancedCalculatorTest extends BaseDriver {
    private AdvancedCalculatorPage advancedCalculatorPage;

    @Before
    public void changeOrientation(){
        driver.rotate(ScreenOrientation.LANDSCAPE);
        advancedCalculatorPage = new AdvancedCalculatorPage();
        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), advancedCalculatorPage);
    }

    @Test
    public void shouldCalculateSinusOfZero(){
        advancedCalculatorPage.sinus.click();
        advancedCalculatorPage.tap(0);
        driver.findElement(By.xpath("//*[@text=')']")).click();
        advancedCalculatorPage.equals.click();
        System.out.println(advancedCalculatorPage.formula.getText());
    }

    @Test
    public void textToTapsTest(){
        convertTextToTaps("21+33=");
        System.out.println(advancedCalculatorPage.formula.getText());
    }

    public void convertTextToTaps(String string){
        String[] list = string.replaceAll("\\s+","").split("");
        for (String s : list){
            driver.findElement(By.xpath("//*[@text='"+s+"']")).click();
        }
    }
}
