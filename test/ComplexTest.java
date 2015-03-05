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
    public void modulusTest() throws Exception {
        assertEquals(5, new Complex(4, 3).modulus(), 0.0000001);
        assertEquals(5, new Complex(4, -3).modulus(), 0.0000001);
    }

    @Test
    public void mulTest() throws Exception {
        Complex c = new Complex(2, 4);
        Assert.assertEquals(new Complex(2, 4), c.mul(1, 0));
        Assert.assertEquals(new Complex(-4, 2), c.mul(0, 1));
        Assert.assertEquals(new Complex(-2, 6), c.mul(1, 1));
        Assert.assertEquals(new Complex(-4, -28), c.mul(-6, -2));
    }
}