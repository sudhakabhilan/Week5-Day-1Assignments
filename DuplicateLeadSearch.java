package week5.day1.dailyassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadSearch extends BaseTestleaftaps {

		@Test
	public  void duplicatedsearch() throws InterruptedException {
	

		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		
		driver.findElement(By.xpath("//a[@href= '#']//span[text() ='Email']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("test@email.com");
		
		
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-firstName']/a[@class = 'linktext'])[1]")).click();
		String fname = driver.findElementById("viewLead_firstName_sp").getText();
		driver.findElement(By.xpath("//div[@class = 'frameSectionExtra']/a[@class = 'subMenuButton']")).click();
		String fnameinleadpage = driver.findElementById("createLeadForm_firstName").getAttribute("value");
		if(fname.equals(fnameinleadpage) ) {
			System.out.println("The Names are same");
		}
		
			}

}
