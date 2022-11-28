package com.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sadam\\eclipse-workspace\\NovBDD\\src\\test\\java\\com\\bdd\\feature\\demo2.feature" ,
glue="com.bdd.stepdefinition",
plugin={"pretty","html:CucumberReport"},
tags={"@login"},
monochrome=true,
dryRun=true)

public class TestRunner {

}
