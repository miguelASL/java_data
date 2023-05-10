package org.sarmiento.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class ejemploLocalTime {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2023, 5, 10);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2023, Month.MAY, 10);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2023-05-10");
        System.out.println("fechaActual = " + fechaActual);

        LocalDate diaDeMañaan = LocalDate.now().plusDays(1);
        System.out.println("diaDeMañaan = " + diaDeMañaan);

        LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
        System.out.println("mesAnteriorMismoDia = " + mesAnteriorMismoDia);

        DayOfWeek miercoles = LocalDate.parse("2023-05-10").getDayOfWeek();
        System.out.println("miercoles = " + miercoles);

        int diez = LocalDate.of(2023,05,10).getDayOfMonth();
        System.out.println("once = " + diez);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2022-11-10"));
        System.out.println("esAntes = " + esAntes);
        
        Month mes = fechaActual.getMonth();
        System.out.println("mes.getDisplayName(TextStyle.FULL, new Locale(\"es\",\"ES\")) = " + mes.getDisplayName(TextStyle.FULL, new Locale("es","ES")));
    }
}
