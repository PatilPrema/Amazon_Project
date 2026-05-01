package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.BaseClass_Amazon; // 👉 make sure this exists

public class ListnersLogic implements ITestListener {

    // Method to capture screenshot
    public void takeScreenshot(ITestResult result, String status) {

        // 👉 Get driver from BaseClass
        WebDriver driver = ((BaseClass_Amazon) result.getInstance()).driver;

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String testName = result.getName();

        File destination = new File(
                "D:\\Users\\Prema\\eclipse-workspace\\ProjectAmazon2\\Screenshot\\"
                        + testName + "_" + status + ".png");

        try {
            FileHandler.copy(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        takeScreenshot(result, "PASS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot(result, "FAIL");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        takeScreenshot(result, "SKIPPED");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}