package cleanAppium;

import activities.contact.ContactFormScreen;
import activities.contact.MainContactScreen;
import activities.contact.UpdateDialog;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class ContactManagerCleanTest extends  TestBase {

    UpdateDialog updateDialog= new UpdateDialog();
    MainContactScreen mainContactScreen = new MainContactScreen();
    ContactFormScreen contactFormScreen= new ContactFormScreen();
    String name="AAAREMOVEEEEEEEE";
    String phone="123213123123";
    String email="remove@remove.com";

    @Test
    public void createContactTest() throws MalformedURLException {
        if (updateDialog.okButton.isControlDisplayed())
            updateDialog.okButton.click();

        mainContactScreen.addContactButton.click();
        contactFormScreen.nameTxtBox.set(name);
        contactFormScreen.phoneTxtBox.set(phone);
        contactFormScreen.emailTxtBox.set(email);
        contactFormScreen.saveButton.click();

        Assert.assertTrue("ERROR! contacto no creado",mainContactScreen.isContactInList(name));

    }

}
