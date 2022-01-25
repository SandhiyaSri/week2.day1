package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("DemoSalesManager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sandhiya");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sriraam");
	
	//Dropdown
	WebElement dd = driver.findElement((By.id("createLeadForm_dataSourceId")));
	Select dropdown=new Select(dd);
	//dropdown.selectByVisibleText("Employee");
//	dropdown.selectByValue("LEAD_EXISTCUST");
	//dropdown.selectByIndex();
	
	int size=dropdown.getOptions().size();
	dropdown.selectByIndex(size-1);
	
	driver.findElement(By.name("submitButton")).click();
	
}
}
