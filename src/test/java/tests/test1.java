package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        /*
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

        ///////////////TEXT ALMA//////////////////

        WebElement nametext =driver.findElement(By.xpath("//div/p[@id='name']"));
        String name = nametext.getText();
        System.out.println(name);

        WebElement emailtext =driver.findElement(By.xpath("//div/p[@id='email']"));
        String emaill = emailtext.getText();
        System.out.println(emaill);

        WebElement currentAdresText =driver.findElement(By.xpath("//div/p[@id='currentAddress']"));
        String currentAdres = currentAdresText.getText();
        System.out.println(currentAdres);

        WebElement adrestext =driver.findElement(By.xpath("//div/p[@id='permanentAddress']"));
        String adres =adrestext.getText();
        System.out.println(adres);    */



        //CHECKBOX'A TIKLAMA
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        new Actions(driver).scrollByAmount(0,300).perform();

        String homeCheckBoxCssValue="label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckbox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckbox.click();

        homeCheckbox=driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        String homeCheckBoxClassName =homeCheckbox.getAttribute("class");

        if (homeCheckBoxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("Chechkbox is checked!");
        }else {
            System.out.println("Checkbox is unchecked");
        }


        //10 saniye beklemeye alınmıştır.
        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //CHECKBOX NASIL TIKLANILIR.

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        new Actions(driver).scrollByAmount(0,300).perform();

        WebElement sportCheckBox =driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled= sportCheckBox.isEnabled();
        System.out.println(isEnabled);

        WebElement sportCheckboxlabel= driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));


        if (isEnabled){
            try {
                sportCheckBox.click();
                System.out.println("sport checkbox tıklanmadı");
            }catch (ElementClickInterceptedException e){
                sportCheckboxlabel.click();
                System.out.println("sport checkbox tıklandı");
            }

        }
        boolean isSelected= sportCheckBox.isSelected();
        System.out.println(isSelected +" olduğu doğrulandı");





         }


    }




