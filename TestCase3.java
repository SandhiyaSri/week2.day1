package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		//Create Lead fields
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDropdown = new Select(country);
		countryDropdown.selectByValue("IND");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sandhiya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sriraam");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sandy");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Sri");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Title");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/11/1989");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("general Title");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("44");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("43434343");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("4343");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("4343");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("sandhiya");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sandhiya@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("URL");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sandhiya");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Sandhiya");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("27 arthur");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("1234");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("1234");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("635129");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("635129");
		
		
		
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropdown = new Select(state);
		stateDropdown.selectByValue("IN-TN");
		
		WebElement name=driver.findElement(By.id("createLeadForm_firstName"));
		
		//String firstName=name.getText();
		
		String firstName=name.getAttribute("value");
		System.out.println(firstName);
		
			
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
		
		driver.close();
	
	
	
		
		
		
		
		
		
		
		
	}

}
