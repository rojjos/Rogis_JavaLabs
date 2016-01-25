import org.junit.Test;
import  static org.junit.Assert.*;

/**
 * Created by rogi on 1/21/16.
 */
public class InitializationLab1Tester {
   // ColorfulThing c1 = new ColorfulThing("BLUE");

    @Test
    public void getColorTester() {
        ColorfulThing ct = new ColorfulThing("Blue");
        assertEquals("Good Test case", "Blue", ct.getColor());
    }
    @Test
    public void enumGetColorTester(){
        ColorfulThing ct1 = new ColorfulThing(Color.YELLOW);
        assertEquals("Good Test case", "YELLOW", ct1.enumGetColor().toString());
    }

    }



