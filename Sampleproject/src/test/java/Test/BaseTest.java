package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeSuite
    public void setupExtentReport() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    @AfterSuite
    public void tearDownExtentReport() {
        extent.flush(); // Generates the report
    }
}
