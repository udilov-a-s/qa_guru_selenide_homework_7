package com.udilov.it.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    private final SelenideElement monthPicker = $(".react-datepicker__month-select"),
            yearPicker = $(".react-datepicker__year-select"),
            dayPicker = $(".react-datepicker__month");

    public void setDate(String day, String month, String year) {

        monthPicker.selectOption(month);
        yearPicker.selectOption(year);
        dayPicker.$(byText(day)).click();
    }
}