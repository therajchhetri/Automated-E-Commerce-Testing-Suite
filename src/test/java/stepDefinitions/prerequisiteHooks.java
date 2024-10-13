package stepDefinitions;

import io.cucumber.java.Before;

public class prerequisiteHooks {

    @Before("@LoginAsCustomer")
    public void LoginAsCustomer()
    {
        System.out.println("Logged In As A Customer");
    }

}
