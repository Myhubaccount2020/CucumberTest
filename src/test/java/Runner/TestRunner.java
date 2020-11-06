package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue = "stepDefs",tags = "@bus")


public class TestRunner {
    @AfterClass
    public static void generateReports(){
        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<String>();
        jsonFiles.add("target/cucumber-json-report.json");
        String buildNumber ="120";
        String projectName = "cucumberProject";

        Configuration configuration = new Configuration(reportOutputDirectory,projectName);
        configuration.setBuildNumber(buildNumber);
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
        Reportable result = reportBuilder.generateReports();
    }
    }


