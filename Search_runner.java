package com.test.casestudycucu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin=("html:casereports"),tags="@tag1")

public class Search_runner {

}
