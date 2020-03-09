package com.kolotilkin.infrastructure.config;

public class ConfigurationManager {

    private static final String WEB_DRIVER_TYPE = "browserType";
    private static final String SCREEN_RESOLUTION = "screenResolution";

    private static final String WEB_DRIVER_RUN_ON = "runOn";

    private static final String TEST_ENV = "testEnv";

    public static ConfigurationManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private ConfigurationManager() { }

    public String getWebDriverType() {
        return getValueOrDefault(WEB_DRIVER_TYPE, "CHROME");
    }

    public String getWebDriverRunOn() {
        return getValueOrDefault(WEB_DRIVER_RUN_ON, "LOCAL");
    }

    public String getScreenResolution() {
        return getValueOrDefault(SCREEN_RESOLUTION, "1900x1280");
    }

    public String getTestEnv() {
        return getValueOrDefault(TEST_ENV, "production");
    }

    private String getValueOrDefault(String envVar, String defaultValue) {
        return (System.getenv(envVar) == null || System.getenv(envVar).isEmpty()) ? defaultValue : System.getenv(envVar);
    }

    private static final class SingletonHolder {
        private static final ConfigurationManager INSTANCE = new ConfigurationManager();
    }
}
