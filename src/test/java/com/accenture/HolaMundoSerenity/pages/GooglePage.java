package com.accenture.HolaMundoSerenity.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com.co/")
public class GooglePage extends PageObject {

    @FindBy(name = "q")
    WebElement buscador;

    public void escribeEnLaBarraDeBusqueda() {
        buscador.sendKeys("Hola Mundo \n");
    }
}
