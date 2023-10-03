package model;
import java.util.ArrayList;

public class Notebook {
    private ArrayList<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }
    public ArrayList getNotes() {
        return notes;
    }
}
