package stepdefinition;

import cucumber.api.java.en.Given;

public class tagsDemoStepdefinition {
	@Given("^Executing scenario_One$")
	public void executing_scenario_One() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Executed scenario 1");
	}

	@Given("^Executing scenario_Two$")
	public void executing_scenario_Two() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Executed scenario 2");
	}

	@Given("^Executing scenario_Three$")
	public void executing_scenario_Three() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Executed scenario 3");
	}

	@Given("^Executing scenario_Four$")
	public void executing_scenario_Four() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Executed scenario 4");
	}

	@Given("^Executing scenario_Five$")
	public void executing_scenario_Five() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Executed scenario 5");
	}


}
