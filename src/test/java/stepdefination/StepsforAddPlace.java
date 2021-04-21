package stepdefination;
import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;







@RunWith(Cucumber.class)
public class StepsforAddPlace {
	


	    @Given("^Add place payload$")
	    public void add_place_payload() throws Throwable {

	    System.out.println("kkk");
	    }

	    @When("^User call Add Place Api with POST Http request$")
	    public void user_call_add_place_api_with_post_http_request() throws Throwable {
		    System.out.println("kkk");

	    }

	    @Then("^Response status code 200$")
	    public void response_status_code_200() throws Throwable {
	   
		    System.out.println("kkk");

	    }

	    @And("^Staus in response is OK$")
	    public void staus_in_response_is_ok() throws Throwable {
		    System.out.println("kkk");

	    
	    }

	}
	
	
	
	
	

