package dev.angelo;
    
    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testPersonAttributes() {
        Person person = new Person("Darianyelis", "Colmenares", "21392121", 2002, "Panama", 'F');
        
        assertEquals("Darianyelis", person.getFirstName());
        assertEquals("Colmenares", person.getLastName());
        assertEquals("21392121", person.getIdNumber());
        assertEquals(2002, person.getBirthYear());
        assertEquals("Panama", person.getCountryOfBirth());
        assertEquals('F', person.getGender());
    }
}
