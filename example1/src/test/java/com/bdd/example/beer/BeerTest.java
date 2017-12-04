package com.bdd.example.beer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:", plugin = {"pretty"})
public class BeerTest {

}
