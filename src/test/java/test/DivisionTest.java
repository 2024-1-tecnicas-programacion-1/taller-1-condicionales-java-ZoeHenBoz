package test;

import ejercicios.Division;
import ejercicios.SetDeTenis;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class DivisionTest {
    @Test
    public void testDivisionNoExacta1() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 2\n"
                + "Residuo: 4";
        String valorActual = Division.evaluar(14, 5);
        assertEquals(valorEsperado, valorActual);
    }
    public void testDivisionNoExacta2() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 3\n"
                + "Residuo: 2";
        String valorActual = Division.evaluar(17, 5);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void testDivisionPorCero() {
        String valorEsperado = "No se puede dividir por cero";
        String valorActual = Division.evaluar(10, 0);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void testDivisionNegativa() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: -3\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(-12, -4);
        assertEquals(valorEsperado, valorActual);
    }
}
