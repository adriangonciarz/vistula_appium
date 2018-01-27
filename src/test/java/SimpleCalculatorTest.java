import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest extends BaseDriver{
    private SimpleCalculatorPage simpleCalculatorPage;

    @Before
    public void setup(){
        simpleCalculatorPage = PageFactory.initElements(driver, SimpleCalculatorPage.class);
        simpleCalculatorPage = new SimpleCalculatorPage();
        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), simpleCalculatorPage);

    }

    @Test
    public void simpleTestWithoutPageObject() throws InterruptedException {
        WebElement button2 = driver.findElement(By.id("digit_2"));
        WebElement button1 = driver.findElement(By.id("digit_1"));
        WebElement button4 = driver.findElement(By.id("digit_4"));
        WebElement button7 = driver.findElement(By.id("digit_7"));
        WebElement plus = driver.findElement(By.id("op_add"));
        WebElement equals = driver.findElement(By.id("eq"));
        button2.click();
        button1.click();
        plus.click();
        button4.click();
        button7.click();
        WebElement formula = driver.findElement(By.id("formula"));
        WebElement result = driver.findElement(By.id("result"));
        assertEquals("21+47",formula.getText());
        assertEquals("68", result.getText());
    }

    @Test
    public void simpleTestWithPageObject(){
        simpleCalculatorPage.digit_2.click();
        simpleCalculatorPage.digit_1.click();
        simpleCalculatorPage.plus.click();
        simpleCalculatorPage.digit_4.click();
        simpleCalculatorPage.digit_7.click();
        simpleCalculatorPage.equals.click();

        assertEquals("68",simpleCalculatorPage.formula.getText());
    }

    @Test
    public void testFour(){
        SimplePage simple = new SimplePage();
        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), simple);

        simple.number1.click();
        simple.plus.click();
        simple.number2.click();
        simple.times.click();
        simple.number9.click();
        simple.equals.click();

        assertEquals("19", simple.top.getText());
        assertEquals("", simple.bottom.getText());

    }
}
