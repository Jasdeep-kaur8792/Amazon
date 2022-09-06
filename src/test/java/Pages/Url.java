package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Url {
     static WebDriver driver;


     public Url(WebDriver driver) {
          this.driver = driver;
     }

     public void click() throws InterruptedException {
          driver.manage().window().maximize();
          Thread.sleep(3000);
         driver.findElement(By.xpath("(//a[@class='nav-primary__menu-link icon--hdr-arrow-right'])[1]"));
         //  driver.findElement(By.id("//*[contains(text(),'')]")).click();
//       Actions act = new Actions(driver);
//      // act.moveToElement(driver.findElement(By.xpath("//*[@id=\"SC_Level_1_1_menu\"]"))).perform();
//           act.moveToElement(driver.findElement(By.xpath("(//a[@class='nav-primary__menu-link icon--hdr-arrow-right'])[1]"))).perform();

     }

public static void verification()
{
     WebElement verification = driver.findElement(By.xpath("//h1[@role='alert']"));
    String actual=verification.getText();
    String expected = "Women’s New In";
     Assert.isTrue(actual.contains(expected),"mismatch text");
}
}



