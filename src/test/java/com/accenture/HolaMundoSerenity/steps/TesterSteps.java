package com.accenture.HolaMundoSerenity.steps;

import com.accenture.HolaMundoSerenity.pages.GooglePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TesterSteps {

    GooglePage googlePage;

    @Step
    public void abreElNavegador() {
        googlePage.open();
    }

    @Step
    public void escribeEnLaBarraDeBusqueda() {
        googlePage.escribeEnLaBarraDeBusqueda();
    }

}
