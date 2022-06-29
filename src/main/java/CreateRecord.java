import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateRecord {

    static WebDriver driver;
    public static void createNewRecordPositive() {
        driver.findElement(By.cssSelector("#sk1")).clear();
        driver.findElement(By.cssSelector("#sk2")).clear();
        WebElement firstNumber = driver.findElement(By.cssSelector("#sk1"));
        firstNumber.sendKeys("11");
        WebElement secondNumber = driver.findElement(By.cssSelector("#sk2"));
        secondNumber.sendKeys("11");

        driver.findElement(By.cssSelector("#number > select")).click();
        driver.findElement(By.cssSelector("#number > input[type=submit]:nth-child(10)")).click();
    }

    public static void createNewRecordNegative() {
        driver.findElement(By.cssSelector("#sk1")).clear();
        driver.findElement(By.cssSelector("#sk2")).clear();
        WebElement firstNumber = driver.findElement(By.cssSelector("#sk1"));
        firstNumber.sendKeys("");
        WebElement secondNumber = driver.findElement(By.cssSelector("#sk2"));
        secondNumber.sendKeys("");

        driver.findElement(By.cssSelector("#number > select")).click();
        driver.findElement(By.cssSelector("#number > input[type=submit]:nth-child(10)")).click();


    }
}
