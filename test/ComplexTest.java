import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void addTest() throws Exception {
        Complex c = new Complex(10, 10);
        assertEquals(new Complex(10, 12), c.plus(0, 2));
        assertEquals(new Complex(10, 12), c.plus(new Complex(0, 2)));
        assertEquals(new Complex(8.5, 8.5), c.plus(new Complex(-1.5, -1.5)));
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
        assertEquals(new Complex(2, 4), c.mul(1, 0));
        assertEquals(new Complex(-4, 2), c.mul(0, 1));
        assertEquals(new Complex(-2, 6), c.mul(1, 1));
        assertEquals(new Complex(-4, -28), c.mul(-6, -2));
    }
    @Test
    public void DivisionTest() throws Exception {
        Complex c1 = new Complex(10, 10);
        assertEquals(new Complex(5, 5), c1.divide(2, 0));
        assertEquals(new Complex(5, 5), c1.divide(new Complex(2, 0)));

        assertEquals(new Complex(5, -5), c1.divide(0, 2));
        assertEquals(new Complex(5, -5), c1.divide(new Complex(0, 2)));

        assertEquals(new Complex(2.5, 2.5), c1.divide(4, 0));
        assertEquals(new Complex(2.5, 2.5), c1.divide(new Complex(4, 0)));

        c1 = new Complex(3, 6);
        assertEquals(new Complex(2.25, 0.75), c1.divide(2, 2));
        assertEquals(new Complex(2.25, 0.75), c1.divide(new Complex(2, 2)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void DivisionByComplexZeroAsNumbersTest() {
        Complex c = new Complex(10, 10);
        c.divide(0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void DivisionByComplexZeroAsComplexTest() {
        Complex c = new Complex(10, 10);
        c.divide(new Complex(0, 0));
    }
}