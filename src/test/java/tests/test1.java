package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();


        WebElement fullname= driver.findElement(By.id("userName"));
        fullname.click();
        fullname.sendKeys("111 0111n");
        new Actions(driver).scrollByAmount(0,300).perform();


        WebElement email=driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("1111-p8@hotmail.com");


        WebElement adress=driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        adress.click();
        adress.sendKeys("Antalya, Türkiye");

        WebElement permanentAdress= driver.findElement(By.id("permanentAddress"));
        permanentAdress.click();
        permanentAdress.sendKeys("Antalya, muratpaşa mh");


        WebElement element = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();


    }
}
