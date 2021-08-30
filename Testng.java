package org.pck;

import java.util.Date;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
	static WebDriver driver;


@BeforeClass
public static void launch() {
	System.setProperty("webdriver.chrome.driver","D:\\programs\\Mavenproject\\driver\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
}
@BeforeMethod
public void start(){
	Date d = new Date();
	System.out.println(d);
}
@AfterMethod
public void end(){
	Date d1 = new Date();
	System.out.println(d1);
}
@AfterClass
public void quit(){
	driver.quit();
}


@Test(priority=-2)
public void test() throws InterruptedException{
	WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
	close.click();
	Thread.sleep(2000);
}
@Test(priority=1)
public void test1() throws InterruptedException{
	boolean b=driver.findElement(By.xpath("//div[text()='Top Offers']")).isDisplayed();
	System.out.println("top offers="+b);
	Thread.sleep(2000);
	boolean b1=driver.findElement(By.xpath("//div[text()='Grocery']")).isDisplayed();
	System.out.println("Grocery="+b1);
	Thread.sleep(2000);
	boolean b2=driver.findElement(By.xpath("//div[text()='Mobiles']")).isDisplayed();
	System.out.println("Mobiles="+b2);
	Thread.sleep(2000);
	boolean b3=driver.findElement(By.xpath("//div[text()='Fashion']")).isDisplayed();
	System.out.println("Fashion="+b3);
	Thread.sleep(2000);
	boolean b4=driver.findElement(By.xpath("//div[text()='Electronics']")).isDisplayed();
	System.out.println("Electronics="+b4);
	Thread.sleep(2000);
	boolean b5=driver.findElement(By.xpath("//div[text()='Home']")).isDisplayed();
	System.out.println("Home="+b5);
	Thread.sleep(2000);
	boolean b6=driver.findElement(By.xpath("//div[text()='Appliances']")).isDisplayed();
	System.out.println("Appliances="+b6);
	Thread.sleep(2000);
	boolean b7=driver.findElement(By.xpath("//div[text()='Travel']")).isDisplayed();
	System.out.println("travel="+b7);
	Thread.sleep(2000);
	boolean b8=driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']")).isDisplayed();
	System.out.println("Beauty, Toys & More="+b8);
	Thread.sleep(2000);
}
@Test(priority=2)
public void test2() throws InterruptedException{
	WebElement p = driver.findElement(By.xpath("//input[@name='q']"));
	p.sendKeys("redmi moblies");
	WebElement q = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	q.click();
	Thread.sleep(4000);
	
	String s1 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).getText();
	System.out.println(s1);
	Thread.sleep(3000);
	driver.navigate().back();
	WebElement tv=driver.findElement(By.xpath("//input[@type='text']"));
	tv.sendKeys("TV");

	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(4000);
	String s2=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).getText();
	System.out.println(s2);
	
}
}
