package org.stepdefinition;

import java.io.IOException;

import org.base.Baseclass;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {
	@Before("@sanity")
	public void before_sanity_scenario() {
		System.out.println("sanity @before running");
	}

	@After("@sanity")
	public void after_sanity_scenario() {
		System.out.println("sanity @after running");
	}

	@Before("@regression")
	public void before_regression_scenario() {
		System.out.println("regression @before running");
	}

	@After("@regression")
	public void after_regression_scenario() {
		System.out.println("regression @after running");
	}

	@Before
	public void before_scernario() {
		chromeBrowserNew();
		maxwindow();
		HoldingTime(5);
	}

	@After
	public void after_scenario(Scenario s) throws IOException {

		String name = s.getName();
		String filename = name.replace(" ", "_");
		System.out.println(filename);
		takeSS(filename);
		System.out.println("Program finished...");

	}
}
