package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraDescuentos {

    public double calcularPrecioFinal(double precioOriginal, double porcentajeDescuento) {
        if (precioOriginal <= 0) {
            throw new IllegalArgumentException("El precio original debe ser mayor que cero");
        }
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100");
        }

        double precioFinal = precioOriginal * (1 - porcentajeDescuento / 100.0);
        return BigDecimal.valueOf(precioFinal)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
