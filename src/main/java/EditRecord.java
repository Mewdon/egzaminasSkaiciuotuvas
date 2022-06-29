import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditRecord {
    static WebDriver driver;

    public static void editRecordPositive() {
        driver.findElement(By.cssSelector("body > div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#command > p:nth-child(2) > input[type=number]")).clear();
        WebElement editNumber = driver.findElement(By.cssSelector("#command > p:nth-child(2) > input[type=number]"));
        editNumber.sendKeys("15");
        driver.findElement(By.cssSelector("#command > p:nth-child(6) > input[type=submit]")).click();
    }



    public static void editRecordNegative() {
        driver.findElement(By.cssSelector("body > div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#command > p:nth-child(2) > input[type=number]")).clear();
        WebElement editNumber = driver.findElement(By.cssSelector("#command > p:nth-child(2) > input[type=number]"));
        editNumber.sendKeys("");
        driver.findElement(By.cssSelector("#command > p:nth-child(6) > input[type=submit]")).click();

    }
}
