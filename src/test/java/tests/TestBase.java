package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestBase {

    WebDriver wd;


    public void click (By locator){
        wd.findElement(locator).click();

    }
}
