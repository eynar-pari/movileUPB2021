package cleanAppium;

import activities.calculadora.MainScreen;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sesion.Session;

import java.net.MalformedURLException;

public class CalculadoraTes {
    MainScreen mainScreen = new MainScreen();

    @Test
    public void operationAdditionTest() throws MalformedURLException {

        mainScreen.sevenButton.click();
        mainScreen.plusButton.click();
        mainScreen.twoButton.click();
        mainScreen.equalButton.click();
        String expected="9";
        String actual=mainScreen.resultLabel.getText();
        Assert.assertEquals("ERROR! La suma es incorrecta",expected,actual);

    }

    @After
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
