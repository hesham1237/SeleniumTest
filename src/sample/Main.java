package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Main  {

    public static void main(String[] args)
    {

        System.out.println("Hello");


    }
    @Test
    public void Tester(){

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        webDriver.manage().window().maximize();
       webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       //Add to cart
        webDriver.findElement(By.xpath(".//*[text()='Add to cart']")).click();
        //proceed to checkout
        webDriver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
        //proceed to checkout #2
        webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
        //Enter a value in the TextField
        webDriver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("Hesham1@hotmail.com");
        //Create an account
        webDriver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
        //Title
        webDriver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]")).click();
        //FirstName
        webDriver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Hesham");
        //LastName
        webDriver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Almalki");
        //Password
        webDriver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("123456");
        //day
        webDriver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("3");
        //month
        webDriver.findElement(By.xpath("//*[@id=\"months\"]")).sendKeys("may");
        //year
        webDriver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("2000");
        //Address
        webDriver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("John A. Smith,1033 ,Los Angeles,CA");
        //City
        webDriver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Los Angeles");
        //State
        webDriver.findElement(By.xpath("//*[@id=\"id_state\"]")).sendKeys("California");
        //ZIPCod
        webDriver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("00000");
        //Country
        webDriver.findElement(By.xpath("//*[@id=\"id_country\"]")).sendKeys("United States");
        //Additional Info
        webDriver.findElement(By.xpath("//*[@id=\"other\"]")).sendKeys("88802392039");
        //Mobile phone
        webDriver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("88802392039");
        //Assign an address
        webDriver.findElement(By.xpath("//*[@id=\"alias\"]")).clear();
        webDriver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("my Address");
        //Register
        webDriver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
        //proceed to checkout #3
        webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
        //Agree
        webDriver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
        //Proceed
        webDriver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
        //Pay By wire
        webDriver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        //Confirm
        webDriver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();

















//        obj.manage().window().maximize();

        //where is the botton located
//        WebElement element = obj.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/div[2]/a[1]"));


    }


    }




