package controller;
import model.Note;
import model.Notebook;
import view.NotebookView;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Button;
import java.util.Locale;
public class NotebookController {
    private Notebook notes = new Notebook();
    @FXML
    private TextField title;
    @FXML
    private TextArea content;
    @FXML
    private ChoiceBox selectedTitle;
    @FXML
    private TextArea selectedContent;
    @FXML
    private Button add;
    @FXML
    private Button read;

    @FXML
    private void addNote() {
        String noteTitle = title.getText();
        String noteContent = content.getText();
        Note n = new Note(noteTitle, noteContent);
        notes.addNote(n);
        selectedTitle.getItems().addAll(notes.getNotes());
        System.out.println("Note added");
    }

    @FXML
    private void readNote() {
        Note n = (Note)selectedTitle.getValue();
        selectedContent.setText(n.getContent());
    }

    private static ArrayList<Note> notebook =  new ArrayList<>();
    public ArrayList getArrayList() {
        return this.notebook;
    }
}
