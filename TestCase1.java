package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Sandhiya");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Sriraam");
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement name=driver.findElement(By.id("firstNameField"));
		
		//String firstName=name.getText();
		
		String firstName=name.getAttribute("value");
		System.out.println(firstName);
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
		
		
		
		
		
		
	}

}
