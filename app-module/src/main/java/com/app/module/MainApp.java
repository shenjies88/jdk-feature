package com.app.module;

/**
 * @author shenjies88
 */
public class MainApp {

    private static final System.Logger LOGGER = System.getLogger("MainApp");

    public static void main(String[] args) {
        LOGGER.log(System.Logger.Level.ERROR, "error test");
        LOGGER.log(System.Logger.Level.INFO, "info test");
    }
}