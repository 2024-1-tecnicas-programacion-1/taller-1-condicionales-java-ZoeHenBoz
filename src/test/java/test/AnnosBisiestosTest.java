package test;

import ejercicios.AnnosBisiestos;
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
public class AnnosBisiestosTest {
    @Test
    public void test1988() {
        String valorEsperado = "1988 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1988);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void test2004() {
        String valorEsperado = "2004 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2004);
        assertEquals(valorEsperado, valorActual);
    }

    public void test1960() {
        String valorEsperado = "1960 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1960);
        assertEquals(valorEsperado, valorActual);
    }

    public void test2020() {
        String valorEsperado = "2020 es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2020);
        assertEquals(valorEsperado, valorActual);
    }

    public void test2100() {
        String valorEsperado = "2100 no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(2100);
        assertEquals(valorEsperado, valorActual);
    }

    public void test1999() {
        String valorEsperado = "1999 no es bisiesto";
        String valorActual = AnnosBisiestos.evaluar(1999);
        assertEquals(valorEsperado, valorActual);
    }
}
