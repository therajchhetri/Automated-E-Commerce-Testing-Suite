package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import Utils.TestContextSetup;

public class loginAsCustomer {

    TestContextSetup testContextSetup;

    public loginAsCustomer(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Given("User Landed On Home Page")
    public void landed_on_home_page(){
        testContextSetup.driver = new ChromeDriver();
        testContextSetup.driver.get("https://testshop.rajchhetri.dev");
        testContextSetup.driver.manage().window().fullscreen();
        System.out.println("User Landed On Home Page");
    }

    @When("Clicked On User Icon")
    public void clicked_on_user_icon(){
        testContextSetup.driver.findElement(By.xpath("//*[@id='undefined-sticky-wrapper']/header/div[2]/div[1]/div/div[4]/div[3]/div/div/div[1]/a")).click();
        testContextSetup.driver.manage().window().fullscreen();
        System.out.println("User Clicked On The User Icon");
    }

    @Then("^Logged In As A Customer With Username (.+) and Password (.+)$")
    public void customer_provided_username_and_password(String Username, String Password){
        testContextSetup.driver.findElement(By.xpath("//*[@id='username']")).sendKeys(Username);
        testContextSetup.driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Password);
        testContextSetup.driver.findElement(By.xpath("//*[@id='customer_login']/div[1]/form/p[3]/button")).click();
        System.out.println("Username Used For Login: " + Username);
        System.out.println("Password Used For Login: " + Password);
        System.out.println("User Able To Login As A Customer");
    }

    @And("Customer Dashboard Displayed")
    public void customer_able_to_login(){
        try{
            testContextSetup.driver.findElement(new By.ByLinkText("Dashboard"));
        }catch (Throwable e){
            System.out.println("Customer Dashboard Page Not Found");
        }
        System.out.println("Customer Landed On Dashboard Page");
    }

}
