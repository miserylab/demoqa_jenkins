package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.ModalComponent;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticePage {

    CalendarComponent calendarComponent = new CalendarComponent();
    ModalComponent modalComponent = new ModalComponent();

    //    String loginLocator = "#first_name"; // BAD PRACTICE
    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateSelect = $("#state"),
            citySelect = $("#city"),
            stateCityWrapper = $("#stateCity-wrapper"),
            submitButton = $("#submit"),
            modalDialog = $(".modal-dialog"),
            modalDialogTitle = $("#example-modal-sizes-title-lg");

    public AutomationPracticePage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        RemoveBanners();
        return this;
    }

    public void RemoveBanners () {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

    public AutomationPracticePage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }
    public AutomationPracticePage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }
    public AutomationPracticePage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public AutomationPracticePage setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public AutomationPracticePage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public AutomationPracticePage setBirthDay(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public AutomationPracticePage setSubject(String value)  {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public AutomationPracticePage setHobbies(String value) {
        hobbiesWrapper.$(byText(value)).click();

        return this;
    }

    public AutomationPracticePage setUploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);

        return this;
    }

    public AutomationPracticePage setAddress(String value) {
        addressInput.setValue(value);

        return this;
    }

    public AutomationPracticePage setState(String value) {
        stateSelect.click();
        stateCityWrapper.$(byText(value)).click();

        return this;
    }

    public AutomationPracticePage setCity(String value) {
        citySelect.click();
        stateCityWrapper.$(byText(value)).click();

        return this;
    }

    public AutomationPracticePage clickSubmit() {
        submitButton.click();

        return this;
    }

    public AutomationPracticePage modalDialogAppeared() {
        modalDialog.should(appear);

        return this;
    }

    public AutomationPracticePage verifyModalDialogTitle(String value) {
        modalDialogTitle.shouldHave(text(value));

        return this;
    }

    public AutomationPracticePage verifyResult(String label, String value) {
        modalComponent.verifyValueByLabel(label,value);

        return this;
    }

}
