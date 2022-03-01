package learnTestNG;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day2.ReadExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{
	@Test
	public void createLead(String companyName,String firstName,String lastName)
	{
    
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("companyName");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstName");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastName");
	driver.findElement(By.name("submitButton")).click();
	
}
	
//	@DataProvider(name="createLeadData",indices=1)
//	public String[][] sendData()throws IOException
//	{
//		return ReadExcel.readData("CreateLead");
//	}
////	@DataProvider
//	public String[][] sendData()
//	{
//		String[][] data=new String[2][3];
//	data[0][0]="TCS";
//		data[0][1]="priya";
//		data[0][2]="D";
//		
//		data[1][0]="Wipro";
//		data[1][0]="Lemy";
//		data[1][0]="A";
//		return data;
//	}

}



