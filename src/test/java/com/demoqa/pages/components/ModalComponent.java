package com.demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ModalComponent {

        SelenideElement modalTable = $(".table-responsive");

        public void verifyValueByLabel(String label, String value) {
            modalTable.$(byText(label)).parent().shouldHave(text(value));
        }

}
