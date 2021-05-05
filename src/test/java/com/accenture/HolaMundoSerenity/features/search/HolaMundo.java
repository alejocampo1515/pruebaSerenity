package com.accenture.HolaMundoSerenity.features.search;

import com.accenture.HolaMundoSerenity.steps.TesterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HolaMundo {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    public TesterSteps tester;

    @Test
    @Title("Prueba de Titulo")
    public void busquedaDeHolaMundoEnGoogle() {
        tester.abreElNavegador();
        tester.escribeEnLaBarraDeBusqueda();
    }

}
