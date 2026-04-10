package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescuentosTest {

    private final CalculadoraDescuentos calc = new CalculadoraDescuentos();

    @Test
    void testSinDescuento() {
        assertEquals(100.0, calc.calcularPrecioFinal(100.0, 0));
    }

    @Test
    void testDescuentoTotal() {
        assertEquals(0.0, calc.calcularPrecioFinal(100.0, 100));
    }

    @Test
    void testDescuento20Porciento() {
        assertEquals(80.0, calc.calcularPrecioFinal(100.0, 20));
    }

    @Test
    void testDescuento50Porciento() {
        assertEquals(50.0, calc.calcularPrecioFinal(100.0, 50));
    }

    @Test
    void testDosDecimales() {
        assertEquals(66.67, calc.calcularPrecioFinal(100.0, 33.33));
    }

    @Test
    void testPrecioNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calcularPrecioFinal(-50.0, 10));
    }

    @Test
    void testPrecioCeroLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calcularPrecioFinal(0, 10));
    }

    @Test
    void testDescuentoNegativoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calcularPrecioFinal(100.0, -5));
    }

    @Test
    void testDescuentoMayorCienLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> calc.calcularPrecioFinal(100.0, 101));
    }
}
