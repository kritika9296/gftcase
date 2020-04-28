package gft2;




import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;




import org.testng.annotations.Test;



import gft1.sel1;

public class sel2 
{
	
	
	WebDriver driver;

	
	
	@Test
	public void configure_details()
	{
		driver = sel1.configure_details();
		driver.get("http://cookbook.seleniumacademy.com/Config.html");
		 WebElement dropdown=driver.findElement(By.name("make"));
		   Select s=new Select(dropdown);
		   s.selectByVisibleText("Audi");
		   List<WebElement> allRadioButtons = driver.findElements(By.name("fuel_type"));
		   allRadioButtons.get(0).click();
		   WebElement ch=driver.findElement(By.name("airbags"));
		   ch.click();
		  // List<WebElement> cho = driver.findElements(By.xpath("//input[@type='checkbox']"));
		  // for(WebElement e:cho) {
			//   e.click();
		   //}
		   Select oSelect = new Select(driver.findElement(By.name("color")));
		   List<WebElement> oSize = oSelect.getOptions();
		   int iListSize = oSize.size();
		   
		   
		   for(int i =0; i < iListSize ; i++){
		  
		   String sValue = oSelect.getOptions().get(i).getText();
		  System.out.println(sValue);
		 
		   }
		   oSelect.selectByVisibleText("Red");
		   oSelect.selectByVisibleText("Brown");
			   driver.findElement(By.id("chatbutton")).click();
			   
			   String act=driver.getTitle();
			   
			   System.out.println(act);
			   //String expt="Build my Car - Configuration";
			   if(act.equals("Build my Car - Configuration"))
				   System.out.println("Title Matched");
				   else
				   System.out.println("Title didn't match");
			   Set<String> w=driver.getWindowHandles();
			   Iterator<String> it=w.iterator();
			   String mrt=it.next();
			  
			   
			   String sec=it.next();
			   driver.switchTo().window(sec);
			   driver.manage().window().maximize();
			   driver.findElement(By.id("closebutton")).click();
			   driver.switchTo().window(mrt);
			   driver.close();
			   
			   
			   
		   }
		   
	}
	
	
	
	
	
	
	

	
	//@Test(priority=1)
	//public void testRegistration() throws InterruptedException
	//{
		//logger = report.createTest("Registration");
		
	//}
	
