package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox extends BaseTest {
    @Test
    void fillUpTheFormTest(){
        //настрить время
              driver.get("https://demoqa.com/text-box");//открыть сайт
        WebElement fullNameInputField = driver.findElement(By.id("userName"));
            String expectedFullName = "Mirlanova Chynara";
        fullNameInputField.sendKeys("Mirlanova Chynara");

        WebElement emailField = driver.findElement(By.id("userEmail"));
            String expectedEmail = "ch.mirlanova@mail.ru";
        emailField.sendKeys("ch.mirlanova@mail.ru");

        WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
            String expectedCurrentAddress = "Bishkek";
        currentAddressField.sendKeys("Bishkek");

        WebElement permanentAddressFirld = driver.findElement(By.id("permanentAddress"));
            String expectedPermanentAddress = "Dubai";
        permanentAddressFirld.sendKeys("Dubai");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);//что бы прокрутить
        submitBtn.click();
        //Thread.sleep(5000);

        WebElement resultName = driver.findElement(By.id("name"));

        System.out.println(resultName.getText());
        Assert.assertTrue(resultName.getText().contains(expectedFullName));

        WebElement resultEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAddress.getText().contains(expectedCurrentAddress));

        WebElement resultPermanentAddress = driver.findElement(By.xpath("//p[@id = 'permanentAddress']"));
        Assert.assertTrue(resultPermanentAddress.getText().contains(expectedPermanentAddress));






    }
}
