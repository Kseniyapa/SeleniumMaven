package com.pflb.school.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class SettingsForDriver {
    private static String uxcrowdTestStand;

    public SettingsForDriver(WebDriver driver) {
        PageFactory.initElements(driver, this);

        InputStream inputStream = DriverManager.class.getClassLoader().getResourceAsStream("config.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException((e));
        }
        uxcrowdTestStand = properties.getProperty("test.stand");
    }

    public static String getStand() {
        return uxcrowdTestStand;
    }
}
