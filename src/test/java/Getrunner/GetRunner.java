package Getrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/features/",glue="stepdefinitions",
monochrome=true,
plugin= {"pretty","html:report/WebReport"},
tags= {"@Postwithmultipledata"}
		)

public class GetRunner 
{

}
