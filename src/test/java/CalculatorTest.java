import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    @BeforeMethod
    public void setup(){
        Calculator.setup();
    }

    @AfterMethod
    public void close(){
        Calculator.closeBrowser();
    }

    @Test (priority = 2)
    public void createUserPositive() {
        CreateUser.createUserPositive();
        Assert.assertTrue(Calculator.confirmUserLogin());
    }

    @Test (priority = 1)
    public void createUserNegative() {
        CreateUser.createUserNegative();
        Assert.assertFalse(Calculator.confirmUserLogin());
    }

    @Test (priority = 4)
    public void loginUserPositive(){
        LoginUser.loginUserPositive();
        Assert.assertTrue(Calculator.confirmUserLogin());
    }

    @Test (priority = 3)
    public void loginUserNegative(){
        LoginUser.loginUserNegative();
        Assert.assertFalse(Calculator.confirmUserLogin());
    }

    @Test (priority = 5)
    public void createRecordNegative(){
        LoginUser.loginUserPositive();
        CreateRecord.createNewRecordNegative();
        Assert.assertFalse(Calculator.confirRecord());
    }

    @Test (priority = 6)
    public void createRecordPositive(){
        LoginUser.loginUserPositive();
        CreateRecord.createNewRecordPositive();
        Assert.assertTrue(Calculator.confirRecord());
    }

    @Test (priority = 7)
    public void editRecordPositive(){
        LoginUser.loginUserPositive();
        Calculator.goAtliktosOperacijos();
        EditRecord.editRecordPositive();
        Assert.assertTrue(Calculator.confirmRecordEdit());
    }

    @Test (priority = 8)
    public void editRecordNegative(){
        LoginUser.loginUserPositive();
        Calculator.goAtliktosOperacijos();
        EditRecord.editRecordNegative();
        Assert.assertFalse(Calculator.confirmRecordEdit());
    }

    @Test (priority = 9)
    public void deleteRecordNegative(){
        LoginUser.loginUserPositive();
        Calculator.goAtliktosOperacijos();
        Assert.assertFalse(DeleteRecord.deleteRecordNegative());

    }

    @Test (priority = 10)
    public void deleteRecordPositive(){
        LoginUser.loginUserPositive();
        Calculator.goAtliktosOperacijos();
        Assert.assertTrue(DeleteRecord.deleteRecordPositive());
    }

}
