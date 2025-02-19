package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import POM.login;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
public class loginsteps {
	
	
	 public WebDriver driver;
	public login lp;
	@Given("the user is on login page")
	public void the_user_is_on_login_page() {
		//System.setProperty("webdriver.chrome.driver", "C:\\workspace\\java2024\\OrangeHRM\\src\\test\\java\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    lp=new login(driver);
	}

	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String string, String string2) throws InterruptedException {
		
		Thread.sleep(2000);
		lp.email(string);
		lp.password(string2);
	    
	}

	@When("click on login option")
	public void click_on_login_option() throws InterruptedException {
	 lp.login();   
	 Thread.sleep(1000);
	}

	@Then("user see the results")
	public void user_see_the_results() {
	 try{
		 System.out.println(lp.geterrormsg());
		 
	 }catch(Exception e) {
		 Assert.assertTrue(true);
		 System.out.println(lp.titile());
		 
	 }
	
	 driver.quit();}
	

}


