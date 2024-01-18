package Test_Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
		
		
		@RunWith(Cucumber.class)
		@CucumberOptions(
		        features = {"C:\\Users\\admin\\eclipse-workspace\\Project_Cucumbers\\src\\test\\resources\\FeatureFiles"},
		        glue = "Step_Defenition",
		        monochrome = true,
		        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		        
		)

public class Runner  {

}
