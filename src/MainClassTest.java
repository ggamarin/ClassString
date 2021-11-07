import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        String a = this.getClassString();
        a = a.toLowerCase(Locale.ROOT);
        Assert.assertTrue("False",  a.indexOf("hello") !=-1);

       // String b=this.getClassString();
       // Assert.assertFalse("True", a != "Hello, world");

    }
}
