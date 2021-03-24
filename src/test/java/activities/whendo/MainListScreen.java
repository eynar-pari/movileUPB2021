package activities.whendo;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class MainListScreen {
    public Button addNoteButton= new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public MainListScreen(){}

    public boolean isNoteInList(String title) throws MalformedURLException {
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
    }

}
