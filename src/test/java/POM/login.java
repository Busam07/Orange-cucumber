package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class login {

	public WebDriver driver;
	public login(WebDriver rdriver) {
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
		
	}
	 
	public void email(String username) {
		
		WebElement txtusername=driver.findElement(By.name("username"));
		txtusername.sendKeys(username);
	}
	
	public void password(String password) {
		
		WebElement txtpass=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		txtpass.sendKeys(password);
	}
	public void login() {
		
		WebElement loginbut=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbut.click();
	}
	public String geterrormsg() {
		WebElement errmsg=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		return errmsg.getText();
	}
	
	public String titile() {
		return driver.getTitle();
	}
}
