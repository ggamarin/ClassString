
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        String a = this.getClassString();
        assertTrue("failed", a.contains("hello") || a.contains("Hello"));
            }
        }


