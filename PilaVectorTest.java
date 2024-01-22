import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PilaVectorTest {
    private Pila<Integer> pila;

    @Before
    public void setUp() {
        pila = new PilaVector<>();
    }

    @Test
    public void testPushAndPeek() {
        pila.push(1);
        assertFalse("La pila no debe estar vacía", pila.isEmpty());
        assertEquals("El elemento en la cima debe ser 1", (Integer)1, pila.peek());
    }

    @Test
    public void testPop() {
        pila.push(2);
        pila.push(3);
        assertEquals("Pop debe devolver el último elemento", (Integer)3, pila.pop());
        assertEquals("Ahora el último debe ser 2", (Integer)2, pila.peek());
    }

    @Test(expected = RuntimeException.class)
    public void testPopEmpty() {
        pila.pop();
    }

    @Test
    public void testIsEmpty() {
        assertTrue("La pila debe estar vacía inicialmente", pila.isEmpty());
        pila.push(4);
        assertFalse("La pila no debe estar vacía después de push", pila.isEmpty());
    }
}
