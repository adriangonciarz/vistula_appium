import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class StudentsTest extends BaseDriver {

    @Test
    public void myFirstTest(){
        MobileElement number8 = (MobileElement) driver.findElementById("digit_8");
        MobileElement plus = (MobileElement) driver.findElementById("op_add");
        MobileElement equals = (MobileElement) driver.findElementById("eq");

        number8.click();
        plus.click();
        number8.click();
        equals.click();

    }

    @Test
    public void testTwo(){
        WebElement number9 = driver.findElementById("digit_9");
        WebElement minus = driver.findElementByAccessibilityId("minus");
        WebElement number2 = driver.findElementById("digit_2");
        WebElement equalSing = driver.findElementByXPath("//*[@text='=']");

        number9.click();
        minus.click();
        number2.click();
        equalSing.click();

        WebElement result = driver.findElementById("formula");
        String resultText = result.getText();
        System.out.println(resultText);
        assertEquals("7", resultText);
    }

    @Test
    public void testThree(){
        WebElement number1 = driver.findElementById("digit_1");
        WebElement number2 = driver.findElementById("digit_2");
        WebElement number9 = driver.findElementById("digit_9");
        WebElement times = driver.findElementById("op_mul");
        WebElement plus = driver.findElementById("op_add");
        WebElement top = driver.findElementById("formula");
        WebElement bottom = driver.findElementById("result");
        WebElement equals = driver.findElementById("eq");

        number1.click();
        plus.click();
        number2.click();
        times.click();
        number9.click();

        assertEquals("1+2×9", top.getText());
        assertEquals("19", bottom.getText());

        equals.click();

        assertEquals("19", top.getText());
        assertEquals("", bottom.getText());

    }
}
