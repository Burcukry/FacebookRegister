package Facebookregister;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.BaseDriver.driver;

public class Facebookregister extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();


        WebElement Checkbutton= driver.findElement(By.cssSelector("a[id^='u_0_0_']"));
        Checkbutton.click();


        WebElement InputName= driver.findElement(By.cssSelector("input[id^='u_2_b']"));
        InputName.sendKeys("Burcu");


        WebElement InputLastName=driver.findElement(By.cssSelector("input[id^='u_2_d'][name='lastname']"));
        InputLastName.sendKeys("Kiray");


        WebElement InputEmail=driver.findElement(By.cssSelector("input[id^='u_2_g'][name='reg_email__']"));
        InputEmail.sendKeys("kiray.brc@gmail.com");


        WebElement InputReMail= driver.findElement(By.cssSelector("input[id^='u_2_j'][name='reg_email_confirmation__']"));
        InputReMail.sendKeys("kiray.brc@gmail.com");


        WebElement Password= driver.findElement(By.cssSelector("input[id='password_step_input'][name='reg_passwd__']"));
        Password.sendKeys("Burcu1234");


        WebElement date=driver.findElement(By.cssSelector("select[aria-label='Month']>option[value='7']"));
        date.click();


        WebElement day=driver.findElement(By.cssSelector("select[aria-label='Day']>option[value='28']"));
        day.click();


        WebElement year=driver.findElement(By.cssSelector("select[id='year']>option[value='1989']"));
        year.click();

        WebElement sex=driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
        sex.click();

        WebElement RegisterButton=driver.findElement(By.cssSelector("button[type='submit'][name='websubmit']"));
        RegisterButton.click();

    }
}
