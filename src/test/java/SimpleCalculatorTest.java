import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SimpleCalculatorTest extends BaseDriver{
    @Test
    public void shouldTest() throws InterruptedException {
        WebElement button9 = driver.findElement(By.id("digit_9"));
        WebElement button2 = driver.findElement(By.id("digit_2"));
        WebElement button1 = driver.findElement(By.id("digit_1"));
        WebElement button3 = driver.findElement(By.id("digit_3"));
        WebElement button7 = driver.findElement(By.id("digit_7"));
        WebElement plus = driver.findElement(By.id("op_add"));
        WebElement equals = driver.findElement(By.id("eq"));
        button2.click();
        button1.click();
        plus.click();
        button3.click();
        button7.click();
        WebElement formula = driver.findElement(By.id("formula"));
        WebElement result = driver.findElement(By.id("result"));
        equals.click();
        Thread.sleep(3000);
        System.out.println(formula.getText());
        System.out.println(result.getText());
    }
}
