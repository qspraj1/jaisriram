package Facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.get("https://app-staging.youshd.com/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[.='Login/ Sign up']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[@class='arrow']")).click();
     driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");
     Thread.sleep(2000);
     Robot rbt=new Robot();
     rbt.keyPress(KeyEvent.VK_DOWN);
     rbt.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(2000);
     rbt.keyPress(KeyEvent.VK_ENTER);
     rbt.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='phoneNo']")).sendKeys("8431191165");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@class='button-continue ']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@aria-label='Please enter verification code.Digit 1']")).sendKeys("1");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@area-label='Digit 2']")).sendKeys("2");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@area-label='Digit 3']")).sendKeys("4");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@area-label='Digit 4']")).sendKeys("4");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@area-label='Digit 5']")).sendKeys("5");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@area-label='Digit 6']")).sendKeys("6");
     driver.findElement(By.tagName("button")).click();
}
}