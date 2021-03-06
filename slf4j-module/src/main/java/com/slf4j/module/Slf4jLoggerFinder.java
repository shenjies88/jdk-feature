package com.slf4j.module;

/**
 * @author shenjies88
 */
public class Slf4jLoggerFinder extends System.LoggerFinder {
    @Override
    public System.Logger getLogger(String name, Module module) {
        return new Slf4jLogger(name);
    }
}