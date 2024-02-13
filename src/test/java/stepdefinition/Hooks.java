package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
@Before
	public void setup() {
		System.out.println("Executed Before scenario");
		
	}
@After
	public void tearDown() {
		System.out.println("Executed After scenario");
}



@Before("@smokeTest")
public void Smokesetup() {
	System.out.println("Executed Beforesmoke scenario");
	
}
@After("@smokeTest")
public void SmoketearDown() {
	System.out.println("Executed After smokescenario");
}
}
