package com.hdapp.appium.domain.home;

import com.hdapp.appium.global.common.OsDriverConnectorImpl;
import com.hdapp.appium.global.util.CommonFunction;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

public class InitLoadAndGoHomeTest {
    private static IOSDriver driver;
    private static OsDriverConnectorImpl osDriverConnector;
    private CommonFunction commonFunction = new CommonFunction();

    @BeforeAll
    public static void setUp() {
        try {
            if (osDriverConnector == null) {
                osDriverConnector = new OsDriverConnectorImpl();  // 객체 생성
            }

            driver = (IOSDriver) osDriverConnector.setUp("iPhone 13 mini", "16.0");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //driver = OsDriverConnector.iosSetUp("iPhone 16", "18.0");
        //driver = OsDriverConnector.iosSetUp("iPhone 15", "17.0");
    }

    @Test
    public void initLoadAndGoHomeTest() {
        Actions actions = new Actions(driver);

    }
}
