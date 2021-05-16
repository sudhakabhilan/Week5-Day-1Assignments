package week5.day1.dailyassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends BaseTestleaftaps {
@Test(enabled = false)
	public  void deletelead() throws InterruptedException {
		
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		
		driver.findElement(By.xpath("//a[@href= '#']//span[text() ='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9884680075");
		
		
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(2000);
		
		String leadid = driver.findElement(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a[@class = 'linktext'])[1]")).getAttribute("href");
		String substr = leadid.substring(leadid.length() - 5);
		System.out.println(substr);
		driver.findElement(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a[@class = 'linktext'])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class = 'frameSectionExtra']/a[@class = 'subMenuButtonDangerous']")).click();
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(substr);
		String result = driver.findElementByClassName("x-paging-info").getText();
		System.out.println(result);
		
		
	}

}
