package com.demoqa.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AutomationPracticeFormTests extends RemoteTestBase {

    @Test
    @Tag("remote")
    @DisplayName("Fill form test")
    void fillFormTest() {
        step("Open page", () ->
                automationPracticePage.openPage());

        step("Fill form", () ->
                automationPracticePage.setFirstName(testData.firstName)
                        .setLastName(testData.lastName)
                        .setUserEmail(testData.userEmail)
                        .setGender(testData.gender)
                        .setUserNumber(testData.userNumber)
                        .setBirthDay(testData.birthDay, testData.birthMonth, testData.birthYear)
                        .setSubject(testData.subject_1)
                        .setSubject(testData.subject_2)
                        .setHobbies(testData.hobby_1)
                        .setHobbies(testData.hobby_2)
                        .setUploadPicture(testData.picture)
                        .setAddress(testData.currentAddress)
                        .setState(testData.state)
                        .setCity(testData.city));
        step("Click Submit", () ->
                automationPracticePage.clickSubmit());

        step("Check modal dialog is open", () ->
                automationPracticePage.modalDialogAppeared());
        step("Check modal dialog title is: " +  testData.modalDialogTitle, () ->
                automationPracticePage.verifyModalDialogTitle(testData.modalDialogTitle));
        step("Check results", () ->
                automationPracticePage.verifyResult("Student Name", testData.firstName + " " + testData.lastName)
                .verifyResult("Student Email", testData.userEmail)
                .verifyResult("Gender", testData.gender)
                .verifyResult("Mobile", testData.userNumber)
                .verifyResult("Date of Birth", testData.birthDay + " " + testData.birthMonth + "," +  testData.birthYear)
                .verifyResult("Subjects", testData.subject_1 + ", " + testData.subject_2)
                .verifyResult("Hobbies", testData.hobby_1 + ", " + testData.hobby_2)
                .verifyResult("Picture", testData.picture)
                .verifyResult("Address", testData.currentAddress)
                .verifyResult("State and City", testData.state + " " + testData.city));
    }

}
