package activities.whendo;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NoteFormScreen {
    public TextBox titleTxtBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTxtBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton= new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    public NoteFormScreen(){}

}
