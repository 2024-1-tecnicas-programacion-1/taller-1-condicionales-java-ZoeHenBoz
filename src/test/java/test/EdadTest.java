package test;

import ejercicios.Edad;
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
public class EdadTest {
    @Test
    public void test2000Enero1() {
        String valorEsperado = "Usted tiene 24 años";
        String valorActual = Edad.evaluar(1, 1, 2024);
        assertEquals(valorEsperado, valorActual);
    }
    public void test1995Julio15() {
        String valorEsperado = "Usted tiene 26 años.";
        String valorActual = Edad.evaluar(15, 7, 1995);
        assertEquals(valorEsperado, valorActual);
    }

    public void test1980Septiembre30() {
        String valorEsperado = "Usted tiene 41 años.";
        String valorActual = Edad.evaluar(30, 9, 1980);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void test2025Diciembre31() {
        String valorEsperado = "Usted tiene 3 años.";
        String valorActual = Edad.evaluar(31, 12, 2025);
        assertEquals(valorEsperado, valorActual);
    }

    public void test1978Febrero28() {
        String valorEsperado = "Usted tiene 43 años.";
        String valorActual = Edad.evaluar(28, 2, 1978);
        assertEquals(valorEsperado, valorActual);
    }
}
