package org.runner;

import org.base.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = "org.stepdefinition", plugin = { "pretty",
		"json:src\\test\\resources\\Reports\\fb.json" }, dryRun = false, monochrome = true, tags = {
				"@adactinpage or @regression or @sanity" })

public class TestRunner {

	@AfterClass
	public static void jvmReportGeneration() {

		JvmReport.generateJvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports"
				+ "S\\fb.json");

	}

}
