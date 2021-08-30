package org.Test;

import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngTask {
	static WebDriver driver;


	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Newmaven\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://flipkart.com");
		driver.manage().window().maximize();

	}
	@BeforeMethod
	public void start() {
		Date d =new Date();
		System.out.println("Start"+d);
	}
	@AfterMethod
	public void end() {
		Date d=new Date();
		System.out.println("End"+d);
	}

	@AfterClass
	public static void quit(){

	}
	@Test(priority=-1)
	public void test1() throws Throwable {
		WebElement user=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		user.click();
	}
	@Test(priority=1)
	public void test2() throws Throwable{
		boolean l1=driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]")).isDisplayed();
		if (l1 == true) {
			System.out.println("Top offer is diplayed");
		} else {
			System.out.println("Not displayed");
		}

		boolean l2=driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[2]")).isDisplayed();
		if (l2 == true) {
			System.out.println("Grocery is diplayed");
		} else {
			System.out.println("Not displayed");
		}

		boolean l3=driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[3]")).isDisplayed();
		if (l3 == true) {
			System.out.println(" Mobile is diplayed");
		} else {
			System.out.println("Not displayed");
		}
		boolean l4=driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[4]")).isDisplayed();
		if (l4 == true) {
			System.out.println("Fashion is diplayed");
		} else {
			System.out.println("Not displayed");
		}
	}
	@Parameters({"Mob"})
	@Test(priority=2)
	public void test3(String Mob) throws Throwable{
		WebElement mob=driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys(Mob);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(6000);
		String s1=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).getText();
		System.out.println(s1);
		Thread.sleep(4000);
		driver.navigate().back();
	}
	@Parameters({"Tv"})
	@Test(priority=3)
	public void test4(String Tv) throws Throwable{
		WebElement tv=driver.findElement(By.xpath("//input[@type='text']"));
		tv.sendKeys(Tv);

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(6000);
		String s2=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).getText();
		System.out.println(s2);

	}
}
