package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;

@CucumberOptions(
        features = {"classpath:cucumber/"},
        glue={"stepdefinition"})
public class RunnerTest extends AbstractTestNGCucumberTests{

}