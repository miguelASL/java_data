package org.sarmiento.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;

public class EjemploLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.of(2023, Month.MAY, 10, 11,31,25);
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.parse("2023-05-25T11:31:25");
        System.out.println("fechaTiempo = " + fechaTiempo);
    }
}
