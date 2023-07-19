package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.AutomationPracticePage;
import com.demoqa.utils.TestData;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {
    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    TestData testData = new TestData();
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.pageLoadStrategy = "eager";
    }

}
