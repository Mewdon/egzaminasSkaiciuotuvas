import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeleteRecord {

    static WebDriver driver;

    public static boolean deleteRecordPositive() {
        boolean result;

        List<WebElement> rowsBeforeDelete = driver.findElements(By.cssSelector("body > div > table > tbody > tr"));
        rowsBeforeDelete.size();
        System.out.println(rowsBeforeDelete.size());

        driver.findElement(By.cssSelector("body > div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a:nth-child(2)")).click();
        driver.switchTo().alert().accept();

        List<WebElement> rowsAfterDelete = driver.findElements(By.cssSelector("body > div > table > tbody > tr"));
        rowsAfterDelete.size();
        System.out.println(rowsAfterDelete.size());

        if (rowsBeforeDelete.size() > rowsAfterDelete.size()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    public static boolean deleteRecordNegative() {

        boolean result;

        List<WebElement> rowsBeforeDelete = driver.findElements(By.cssSelector("body > div > table > tbody > tr"));
        rowsBeforeDelete.size();


        driver.findElement(By.cssSelector("body > div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a:nth-child(2)")).click();
        driver.switchTo().alert().dismiss();

        List<WebElement> rowsAfterDelete = driver.findElements(By.cssSelector("body > div > table > tbody > tr"));
        rowsAfterDelete.size();


        if (rowsBeforeDelete.size() > rowsAfterDelete.size()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


}
