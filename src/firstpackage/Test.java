package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);
        FirstClass firstClass = new FirstClass();
        firstClass.setActualTitle(driver.getTitle());
        firstClass.compareTitle();

        String baseUrlFb = "http://www.facebook.com";
        driver.get(baseUrlFb);
        SecondClass secondClass = new SecondClass();
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement loginBtn = driver.findElement(By.id("loginbutton"));
        email.sendKeys("fauzan.sapr@gmail.com");
        password.sendKeys("Damnbitch2");
        loginBtn.click();
        driver.close();
    }
}
