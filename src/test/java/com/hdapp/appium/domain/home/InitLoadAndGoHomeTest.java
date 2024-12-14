package com.hdapp.appium.domain.home;

import com.hdapp.appium.global.common.OsDriverConnector;
import com.hdapp.appium.global.util.CommonFunction;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

public class InitLoadAndGoHomeTest {
    private static IOSDriver driver;
    private CommonFunction commonFunction = new CommonFunction();

    @BeforeAll
    public static void setUp() {
        //driver = OsDriverConnector.iosSetUp("iPhone 16", "18.0");
        driver = OsDriverConnector.iosSetUp("iPhone 15", "17.0");
    }

    @Test
    public void initLoadAndGoHomeTest() {
        Actions actions = new Actions(driver);

    }
}
