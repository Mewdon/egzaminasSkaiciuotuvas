import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateUser {

    static WebDriver driver;

    public static void createUserNegative() {

        driver.findElement(By.cssSelector("body > div > form > div > h4 > a")).click();

        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("Test1");

        WebElement userPassword = driver.findElement(By.cssSelector("#password"));
        userPassword.sendKeys("");

        WebElement userPasswordConfirm = driver.findElement(By.cssSelector("#passwordConfirm"));
        userPasswordConfirm.sendKeys("");

        driver.findElement(By.cssSelector("#userForm > button")).click();
    }

    public static void createUserPositive() {
        driver.findElement(By.cssSelector("body > div > form > div > h4 > a")).click();

        WebElement userName = driver.findElement(By.cssSelector("#username"));
        userName.sendKeys("Test3");

        WebElement userPassword = driver.findElement(By.cssSelector("#password"));
        userPassword.sendKeys("test123");

        WebElement userPasswordConfirm = driver.findElement(By.cssSelector("#passwordConfirm"));
        userPasswordConfirm.sendKeys("test123");

        driver.findElement(By.cssSelector("#userForm > button")).click();

    }

}
