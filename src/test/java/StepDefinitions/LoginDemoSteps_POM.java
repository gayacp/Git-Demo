package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps_POM {
//	WebDriver driver=null;
//	LoginPage login;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		login=new LoginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
////		driver.findElement(By.id("name")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(2000);
//		
//	}
//
//	@When("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException {
////		driver.findElement(By.id("login")).click();
//		login.clickLogin();
//		Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to the homepage")
//	public void user_is_navigated_to_the_homepage() throws InterruptedException {
////		driver.findElement(By.id("logout")).isDisplayed();
//		login.checkLogoutIsDisplayed();
//		Thread.sleep(2000);
//		driver.close();
//
//	}
}
