package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sandhiya");
		driver.findElement(By.name("lastname")).sendKeys("Sriraam");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		
		WebElement day = driver.findElement(By.id("day"));
		Select dayDropdown = new Select(day);
		dayDropdown.selectByValue("12");
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthDropdown = new Select(month);
		monthDropdown.selectByValue("11");
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearDropdown = new Select(year);
		yearDropdown.selectByValue("1989");
		
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
	}

}
