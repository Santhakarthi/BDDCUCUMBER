package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@Test 
@CucumberOptions(features="./src/test/java/featurefiles/Loginfeature5.feature",glue= {"stepdefinition"},dryRun=false,tags= {"@SmokeTest"})
public class Runner  extends AbstractTestNGCucumberTests{

}
