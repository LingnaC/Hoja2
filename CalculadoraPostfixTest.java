/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23117
Isabella Obando 23074*/
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraPostfixTest {

    private CalculadoraPostfix calculadora;

    @Before
    public void setUp() {
        calculadora = new CalculadoraPostfix();
    }

    @Test
    public void testEvaluacionSimple() {
        assertEquals("La evaluación de 1 2 + debería ser 3", 3, calculadora.evaluarExpresion("1 2 +"));
    }

    @Test
    public void testEvaluacionCompleja() {
        assertEquals("La evaluación de 1 2 + 4 * 3 + debería ser 15", 15, calculadora.evaluarExpresion("1 2 + 4 * 3 +"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExpresionInvalida() {
        calculadora.evaluarExpresion("1 2 ?");
    }

    @Test(expected = RuntimeException.class)
    public void testDivisionPorCero() {
        calculadora.evaluarExpresion("1 0 /");
    }
}
