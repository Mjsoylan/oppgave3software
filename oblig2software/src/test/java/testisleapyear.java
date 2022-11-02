import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testisleapyear {
    @Test
    public  void  itsleapyearwhendivedby400()
    {
            assertTrue(main.isleapyear(400));
            assertFalse(main.isleapyear(801));
            assertFalse(main.isleapyear(399));
    }
    @Test
    public  void itsleapyearwhendivedby4andnot100()
    {
        assertTrue(main.isleapyear(2000));
        assertFalse(main.isleapyear(2001));
        assertTrue(main.isleapyear(2004));
        assertFalse(main.isleapyear(2100));

    }
    @Test
    public  void isnotleapyearwhendivedby100butno400()
    {
        assertFalse(main.isleapyear(1900));
        assertFalse(main.isleapyear(1700));
        assertFalse(main.isleapyear(1800));
        assertFalse(main.isleapyear(2100));

    }
    @Test
    public  void isnotleapyearwhennotdivedby4()
    {
        assertFalse(main.isleapyear(3));
        assertTrue(main.isleapyear(4));
        assertFalse(main.isleapyear(5));

    }

}
