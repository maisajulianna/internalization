import org.junit.Test;
import java.util.Locale;
import java.util.ResourceBundle;
import static org.junit.Assert.assertEquals;

public class LocalizedGreetingTest {

    @Test
    public void testEnglishGreeting() {
        Locale locale = new Locale("en", "US");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("hello", greeting);
    }

    @Test
    public void testSpanishGreeting() {
        Locale locale = new Locale("es", "ES");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("hola", greeting);
    }

    @Test
    public void testFrenchGreeting() {
        Locale locale = new Locale("fr", "FR");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("bonjour", greeting);
    }

    @Test
    public void testPersianGreeting() {
        Locale locale = new Locale("fa", "IR");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("سلام", greeting);
    }

    @Test
    public void testJapaneseGreeting() {
        Locale locale = new Locale("ja", "JP");
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("こんにちは", greeting);
    }

    @Test
    public void testInvalidChoiceDefaultsToEnglish() {
        Locale locale = new Locale("en", "US"); // Simulate default choice
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        String greeting = messages.getString("greeting");
        assertEquals("hello", greeting); // Expected default is English
    }
}

