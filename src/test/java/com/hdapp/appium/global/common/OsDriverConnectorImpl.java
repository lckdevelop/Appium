package com.hdapp.appium.global.common;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
@PropertySources({
        @PropertySource("classpath:/properties/iosDriver.properties")
})

public class OsDriverConnectorImpl implements OsDriverConnector {
    @Value("${iosDriver.platformName}")
    private String platformName;

    @Value("${iosDriver.automationName}")
    private String automationName;

    @Value("${iosDriver.app}")
    private String app;

    @Value("${iosDriver.includeSafariInWebviews}")
    private String includeSafariInWebviews;

    @Value("${iosDriver.newCommandTimeout}")
    private String newCommandTimeout;

    @Value("${iosDriver.connectHardwareKeyboard}")
    private String connectHardwareKeyboard;

    @Override
    public URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public IOSDriver setUp(String deviceName, String osVersion) {
        return iosSetUp(deviceName, osVersion);
    }

    private IOSDriver iosSetUp(String deviceName, String osVersion) {
        System.out.println(platformName);
        System.out.println(automationName);
        System.out.println(deviceName);
        System.out.println(osVersion);
        System.out.println(app);
        System.out.println(includeSafariInWebviews);
        System.out.println(newCommandTimeout);
        System.out.println(connectHardwareKeyboard);

        BaseOptions options = new BaseOptions()
                .amend("platformName", platformName)
                .amend("appium:automationName", "XCUITest")
                .amend("appium:deviceName", deviceName)
                .amend("appium:platformVersion", osVersion)
                .amend("appium:app", "com.ehyundai.mcard")
                .amend("appium:includeSafariInWebviews", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        return new IOSDriver(getUrl(), options); // ios driver 실행(앱 실행)
    }
}
