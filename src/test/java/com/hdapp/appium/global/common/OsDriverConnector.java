package com.hdapp.appium.global.common;

import io.appium.java_client.ios.IOSDriver;

import java.net.URL;

public interface OsDriverConnector {
    public IOSDriver setUp(String deviceName, String osVersion) throws Exception;
    public URL getUrl() throws Exception;
}
