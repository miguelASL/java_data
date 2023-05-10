package org.sarmiento.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ejemploLocalDate {
    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println("ahora = " + ahora);
        System.out.println("hora = " + ahora.getHour());
        System.out.println("ahora.getMinute() = " + ahora.getMinute());
        System.out.println("ahora.getSecond() = " + ahora.getSecond());
        System.out.println("ahora.getNano() = " + ahora.getNano());

        LocalTime seisConTreinta = LocalTime.of(6, 30, 45);
        System.out.println("seisConTreinta = " + seisConTreinta);
        seisConTreinta = LocalTime.parse("06:30:45");
        System.out.println("seisConTreinta = " + seisConTreinta);

        LocalTime sieteConTreinta = LocalTime.of(6, 30 ).plus(1, ChronoUnit.HOURS);
        System.out.println("sieteConTreinta = " + sieteConTreinta);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss a"); //Si colocar las horas en mayuscula es formato 24 horas.
        String ahoraFormateado = ahora.format(df);
        System.out.println("ahoraFormateado = " + ahoraFormateado);
    }
}
