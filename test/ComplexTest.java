import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void addTest() throws Exception {
        Complex c = new Complex(10, 10);
        assertEquals(new Complex(10, 12), c.add(0, 2));
        assertEquals(new Complex(10, 12), c.add(new Complex(0, 2)));
        assertEquals(new Complex(8.5, 8.5), c.add(new Complex(-1.5, -1.5)));
    }

    @Test
    public void subtractTest() throws Exception {
        Complex c = new Complex(10, 10);
        assertEquals(new Complex(10, 8), c.minus(0, 2));
        assertEquals(new Complex(10, 8), c.minus(new Complex(0, 2)));
        assertEquals(new Complex(11.5, 11.5), c.minus(new Complex(-1.5, -1.5)));

    }
    @Test
    public void argumentTest() throws Exception

    {
        Complex firstNumber = new Complex(11, 11);
        Complex rightAngle = new Complex(0, 2);
        assertEquals(Math.PI/4, firstNumber.argument(), 0.000001);
        assertEquals(Math.PI/2, rightAngle.argument(), 0.000001);

    }
}
