package com.temp.junit.temptestcase;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qmetry_gui {


	WebDriver driver1;
	/*@Before
	public void openBrowser(){
		//System.setProperty("webdriver.ie.driver","D:\\Softwares\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		
		//WebDriver driver=new InternetExplorerDriver();
		driver1=new ChromeDriver();
		
			driver1.get("https://www.makemytrip.com/");
			driver1.manage().window().maximize();
			driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("url opened");
		
	}*/
	@Test
	public void testLogin() throws InterruptedException {
		

		//System.setProperty("webdriver.ie.driver","D:\\Softwares\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		
		//WebDriver driver=new InternetExplorerDriver();
		driver1=new ChromeDriver();
		
			driver1.get("https://www.makemytrip.com/");
			driver1.manage().window().maximize();
			driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("url opened");
		
	
		//Thread.sleep(15000);
		try{
			driver1.findElement(By.xpath(".//*[@id='header_tab_hotels']")).click();
			System.out.println("clicked on hotel tab");
			driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver1.findElement(By.id("hp-widget__sDest")).clear();
			Thread.sleep(3000);
			driver1.findElement(By.id("hp-widget__sDest")).sendKeys("Goa, India");
			//driver1.findElement(By.id("hp-widget__chkIn")).click();
			Thread.sleep(3000);
			/*driver1.findElement(By.id("hp-widget__chkIn")).clear();
			driver1.findElement(By.id("hp-widget__chkIn")).sendKeys("3 Sep, Mon");
			Thread.sleep(3000);
			driver1.findElement(By.id("hp-widget__chkOut")).clear();
			driver1.findElement(By.id("hp-widget__chkOut")).sendKeys("4 Sep, Tue");*/
			//driver1.findElement(By.xpath(".//*[@id='dp1535612084328']/div/div[1]/table/tbody/tr[2]/td[2]/a")).click();
			Thread.sleep(3000);
			driver1.findElement(By.id("searchBtn")).click();
			Thread.sleep(10000);
			driver1.close();
			driver1.quit();
			
		}
		catch(Exception e){
			driver1.close();
			driver1.quit();
		}
		finally{
			
		}
		
		
		//New Delhi (DEL)
		
		//driver1.findElement(By.xpath("//a[@href='http://intranet.nl.eu.abnamro.com/en/home/tops/index.html#body']")).click();
	}

}
