package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeForm extends BaseTest{
    @Test
    void fillUpTheFormTest() {
      //настрить время
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys("Chynara");

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("Mirlanova");

        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys("ch.mirlanova@mail.ru");

        WebElement genderField = driver.findElement(By.id("genterWrapper"));


    }
}