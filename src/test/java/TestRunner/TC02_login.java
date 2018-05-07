package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Feature",
		
		//features= "C:\\Users\\rozin\\eclipse-workspace\\Project\\Bootcamp1\\feature\\login2.feature",
		
		glue="stepDef",
		tags="@Login2"
		
		
		)
public class TC02_login extends AbstractTestNGCucumberTests {
	

}
