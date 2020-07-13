//package com.pflb.school.pages;
//
//import com.pflb.school.DriverManager;
//import io.qameta.allure.Attachment;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;
//
//public class ScreenshotListener extends TestListenerAdapter {
//
//    public void onTestFailure(ITestResult result) {
//        Object currentClass = result.getInstance();
//        WebDriver driver = ((AbstractTest) currentClass).getDriver();
//        byte[] srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//        saveScreenshot(srcFile);
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        Object currentClass = result.getInstance();
//        WebDriver driver = ((AbstractTest) currentClass).getDriver();
//        byte[] srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//        saveScreenshot(srcFile);
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        Object currentClass = result.getInstance();
//        WebDriver driver = ((AbstractTest) currentClass).getDriver();
//        byte[] srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//        saveScreenshot(srcFile);
//    }
//
//    @Attachment(value = "Page screenshot", type = "image/png")
//    private byte[] saveScreenshot(byte[] screenshot) {
//        return screenshot;
//
//    }
//}
