package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestboxTests {

    @BeforeAll
    static void configur() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

    }
    @Test

    void fillformtest() {
        open("/text-box");
        $("[id=userName]").setValue("Nick");
        $("[id=userEmail]").setValue("Nick@pick.com");
        $("#currentAddress").setValue("my_adress");
        $("#permanentAddress").setValue("My_permanent_adress");
        $("#submit").click();
        $("#output #name").shouldHave(text("Nick"));
        $("#output #email").shouldHave(text("Nick@pick.com"));
        $("#output #currentAddress").shouldHave(text("my_adress"));
        $("#output #permanentAddress").shouldHave(text("My_permanent_adress"));
    }
}
