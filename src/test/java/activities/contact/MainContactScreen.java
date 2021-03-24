package activities.contact;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class MainContactScreen {

    public Button addContactButton = new Button(By.xpath("//android.widget.Button[@text='Add Contact']"));


    public MainContactScreen(){}

    public boolean isContactInList(String nameContact) throws MalformedURLException {
        Label contact= new Label(By.xpath("//android.widget.TextView[@text='"+nameContact+"']"));
        return contact.isControlDisplayed();
    }
}
