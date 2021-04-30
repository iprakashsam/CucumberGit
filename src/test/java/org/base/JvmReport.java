package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonPath) {

		// 1.Mention the target folder location
		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\JvmReport");

		// 2.Add details to report
		Configuration con = new Configuration(f, "Adactin Web App");
		con.addClassifications("Platform name", "Windows");
		con.addClassifications("Platform version", "10");
		con.addClassifications("browser name", "chrome");
		con.addClassifications("browser version", "89.0");

		// 3.Convert String into List<String>
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);

		// 4.call generateReports method for generating report
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();

	}

}
