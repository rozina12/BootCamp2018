package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		
		PageFactory.initElements(driver,this);
		
	}
	
	//page factory model
	//username
	@FindBy(how=How.XPATH, using ="//input[@name='txtUsername']")
	@CacheLookup
	WebElement user_name;
	public WebElement EnterUserName1() {
		return user_name;
	}
	//password
	@FindBy(how=How.XPATH, using ="//input[@name='txtPassword']")
	@CacheLookup
	WebElement Password;
	public WebElement EnterPassword1() {
		return Password;
	}
	//login button
	
	@FindBy(how=How.XPATH, using ="//input[@name='Submit']")
	@CacheLookup
	WebElement login;
	public WebElement ClickLogin() {
		return login;
	}
	
//	public void EnterUserName() {
//		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
//		
//	}
//	public void EnterPassword() {
//		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");
//		
//	}
//	public void ClickLoginButton() {
//		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//		
//	}
//	
	
	//*[@id="txtUsername"]
	
	//*[@id="txtPassword"]
	
	//*[@id="btnLogin"]






}//end class
