package com.bdd.example.calculator.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "com.bdd.example.calculator.steps",
        features = "classpath:cucumber/Calculator.feature"
)
public class RunCalculatorTest {
}
