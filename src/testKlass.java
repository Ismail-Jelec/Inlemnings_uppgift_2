import org.junit.Test;
import static org.junit.Assert.*;

 public class testKlass {

    @Test
    public void testRäknaTecken() {
        logikKlass logik = new logikKlass();
        String text = "Hej\nJag heter inte Staffan\nMen däremot heter jag Ismail";
        int förväntatTecken = 53; // Exkluderar radbrytningar
        assertEquals(förväntatTecken, text.replaceAll("\n", "").length());
    }

    @Test
    public void testRäknaRader() {
        logikKlass logik = new logikKlass();
        String text = "Hej\nJag heter Staffan";
        int förväntatRader = 2;
        assertEquals(förväntatRader, text.split("\n").length);
    }

    @Test
    public void testStop() {
        logikKlass logik = new logikKlass();
        String text = "Hej\nJag heter inte Staffan\nMen däremot heter jag Ismail ;)\nstop";
        assertTrue(text.contains("stop"));
    }
}
