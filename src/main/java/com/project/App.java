package com.project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class App {

    public int userLogin(String in_user, String in_pwd) {
        Properties props = new Properties();
        try {
            FileInputStream fis = new FileInputStream("conf/config.properties");
            props.load(fis);
        } catch (IOException e) {
            System.out.println("Could not load config: " + e.getMessage());
            return 0;
        }

        String username = props.getProperty("username");
        String password = props.getProperty("password");

        if (in_user.equals(username) && in_pwd.equals(password)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        App app = new App();
        int result = app.userLogin("abc", "abc@123");

        if (result == 1) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
        }
    }
}
