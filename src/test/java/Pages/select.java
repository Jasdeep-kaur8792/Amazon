package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class select {
    static WebDriver driver;


    public select(WebDriver driver) {
        this.driver = driver;
    }

    public void select() throws InterruptedException {

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Women')])[1]"))).perform();
        driver.findElement(By.xpath("(//a[contains(text(),'View All')])[1]")).click();
    }
}