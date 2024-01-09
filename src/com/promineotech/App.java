package com.promineotech;

public class App {
    public static void main(String[] args) {
        // Instantiate instances of logger classes
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test methods
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}