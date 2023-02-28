package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W2D2Task1 {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TTLEAF");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Krishna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thiru");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc_123@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2233445566");
		driver.findElement(By.name("submitButton")).click();
	}

}
