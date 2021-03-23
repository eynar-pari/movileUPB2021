package activities.calculadora;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreen {

    public Button sevenButton = new Button(By.id("com.android.calculator2:id/digit_7"));
    public Button twoButton = new Button(By.id("com.android.calculator2:id/digit_2"));
    public Button plusButton = new Button(By.id("com.android.calculator2:id/op_add"));
    public Button equalButton = new Button(By.id("com.android.calculator2:id/eq"));
    public Label resultLabel= new Label(By.id("com.android.calculator2:id/formula"));

    public MainScreen(){}
}
