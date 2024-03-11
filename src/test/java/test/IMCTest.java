package test;

import ejercicios.IMC;
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
public class IMCTest {
    @Test
    public void testBajo() {
        String valorEsperado = "bajo";
        String valorActual = IMC.evaluar(50, 1.8,   20);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void testMedio() {
        String valorEsperado = "medio";
        String valorActual = IMC.evaluar(65, 1.75, 30);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void testAlto() {
        String valorEsperado = "alto";
        String valorActual = IMC.evaluar(80, 1.7, 50);
        assertEquals(valorEsperado, valorActual);
    }
    
    public void testNull() {
        String valorActual = IMC.evaluar(70, 1.6, 35);
        assertEquals(null, valorActual);
    }
}

