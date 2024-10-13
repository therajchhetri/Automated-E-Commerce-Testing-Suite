package stepDefinitions;

import Utils.TestContextSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;

public class registerAsCustomer {
    TestContextSetup testContextSetup;
    public registerAsCustomer(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    @Then("^Registered As A Customer With Email (.+) and Password (.+)$")
    public void registerAsACustomer(String Email, String Password) {
        testContextSetup.driver.findElement(By.xpath("//*[@id='reg_email']")).sendKeys(Email);
        testContextSetup.driver.findElement(By.xpath("//*[@id='reg_password']")).sendKeys(Password);
        testContextSetup.driver.findElement(By.xpath("//*[@id='customer_login']/div[2]/form/p[3]/button")).click();
        System.out.println("Username Used For Login: " + Email);
        System.out.println("Password Used For Login: " + Password);
        System.out.println("User Able To Register As A Customer");
    }
}
