package org.example;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        DesktopOptions option = new DesktopOptions();

        option.setApplicationPath("C:\\Users\\walther\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Blue Bridge Solutions, Ltd\\CoSaCS - 10.192.27.58.appref-ms");

        WiniumDriver driver = new WiniumDriver(new URL("http://DESKTOP-QPT4IBU:9999"), option);

        Thread.sleep(2000);

    }
}