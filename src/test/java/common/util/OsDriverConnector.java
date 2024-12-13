package common.util;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.options.BaseOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class OsDriverConnector {

    private static URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static IOSDriver iosSetUp(String deviceName, String osVersion) {
        BaseOptions options = new BaseOptions()
                .amend("platformName", "ios")
                .amend("appium:automationName", "XCUITest")
                .amend("appium:deviceName", deviceName)
                .amend("appium:platformVersion", osVersion)
                .amend("appium:app", "com.ehyundai.mcard")
                .amend("appium:includeSafariInWebviews", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        return new IOSDriver(OsDriverConnector.getUrl(), options); // ios driver 실행(앱 실행)
    }
}
