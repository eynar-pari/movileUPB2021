package cleanAppium;

import activities.whendo.MainListScreen;
import activities.whendo.NoteFormScreen;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class WhenDoCleanTest extends  TestBase{

    MainListScreen mainListScreen= new MainListScreen();
    NoteFormScreen noteFormScreen= new NoteFormScreen();
    String title="EYNAR";
    String note="note";
    @Test
    public void createNote() throws MalformedURLException {
        mainListScreen.addNoteButton.click();
        noteFormScreen.titleTxtBox.set(title);
        noteFormScreen.noteTxtBox.set(note);
        noteFormScreen.saveButton.click();

        Assert.assertTrue("Nota no fue creada",mainListScreen.isNoteInList(title));
    }
}
