package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    // webdriver= variabila care ne ajuta sa interactionam cu site-ul si elementele de pe site.

    public WebDriver driver;

    @Test
    public void testAutomat (){
        // specificam unde se afla driverul pentru brower
          System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
          // deschidem un browser
        driver= new ChromeDriver();
        // introducem o adresa web
        driver.get("http://demo.automationtesting.in/Index.html");
        //schimbam rezolutia in full-screen sau maximize
        driver.manage().window().maximize();

        //identificam elementul "Sign In"
        WebElement signInElement= driver.findElement(By.id("btn1"));
        // facem un click
        signInElement.click();

        // indentificare element dupa "locaters" : id, class, name, link, css, xpath

        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailValue = "claudia09@yahoo.com";
        emailElement.sendKeys(emailValue);

        WebElement passwordElement = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String passwordValue = "parolabunaditat";
        passwordElement.sendKeys(passwordValue);

        WebElement EnterElement = driver.findElement(By.id("enterbtn"));
        EnterElement.click();


    }
}
