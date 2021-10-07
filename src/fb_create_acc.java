/*
    * Bootcamp ArkusNexus 07/10/21 Mind
    * Jose Gomez Camacho | Remoto | GDL
    * FB - Create Account
* */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class fb_create_acc
{
    public static void main ( String [] args ) throws InterruptedException
    {
        System.setProperty( "webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        String url = "https://www.facebook.com/register";
        driver.get( url );

        WebElement inputFirstName = driver.findElement(By.name("firstname"));
        inputFirstName.sendKeys("Arkus");

        WebElement inputLastName = driver.findElement(By.name("lastname"));
        inputLastName.sendKeys("Nexus");

        WebElement inputEmail = driver.findElement(By.name("reg_email__"));
        inputEmail.sendKeys("devjosegomez@arkusnexus.com");

        WebElement inputEmailConfirmation = driver.findElement(By.name("reg_email_confirmation__"));
        inputEmailConfirmation.sendKeys("devjosegomez@arkusnexus.com");

        WebElement inputPassword = driver.findElement(By.name("reg_passwd__"));
        inputPassword.sendKeys("$12#-,)JXe.3edrrk__004j");

        Select dropDownDay = new Select ( driver.findElement(By.id( "day" )) );
        dropDownDay.selectByIndex( 14 );
        Select dropDownMonth = new Select ( driver.findElement(By.id( "month" )) );
        dropDownMonth.selectByIndex( 1);
        Select dropDownYear = new Select ( driver.findElement(By.id( "year" )) );
        dropDownYear.selectByIndex( 29 );

        WebElement rbtnSex = driver.findElement(By.xpath("//input[@value='2']"));
        rbtnSex.click();

        WebElement btbSubmit = driver.findElement(By.name("websubmit"));
        btbSubmit.click();

        Thread.sleep( 90000 );
        driver.close();

    }
}

