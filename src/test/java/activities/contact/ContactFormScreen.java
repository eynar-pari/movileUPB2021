package activities.contact;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class ContactFormScreen {
     public TextBox nameTxtBox= new TextBox(By.id("com.example.android.contactmanager:id/contactNameEditText"));
    public TextBox phoneTxtBox= new TextBox(By.id("com.example.android.contactmanager:id/contactPhoneEditText"));
    public TextBox emailTxtBox= new TextBox(By.id("com.example.android.contactmanager:id/contactEmailEditText"));
    public Button saveButton= new Button(By.id("com.example.android.contactmanager:id/contactSaveButton"));

    public ContactFormScreen(){}

}
