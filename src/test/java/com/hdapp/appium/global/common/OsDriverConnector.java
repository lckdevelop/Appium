package com.hdapp.appium.global.common;

import io.appium.java_client.AppiumDriver;

import java.net.URL;

public interface OsDriverConnector {
    public AppiumDriver setUp(String deviceName, String osVersion) throws Exception;
    public URL getUrl() throws Exception;
}
