package models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder

public class Tiempo {
    private final String localidad;
    private final String provincia;
    private final double temMax;
    private final LocalTime horaTemMax;
    private final double temMin;
    private final LocalTime horaTemMin;
    private final double precipitacion;

    @Override
    public String toString() {
        return "Tiempo{" +
                "localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", temMax=" + temMax +
                ", horaTemMax=" + horaTemMax +
                ", temMin=" + temMin +
                ", horaTemMin=" + horaTemMin +
                ", precipitacion=" + precipitacion +
                '}';
    }
}



