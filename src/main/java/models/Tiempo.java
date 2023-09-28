package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tiempo {
    private final String localidad;
    private final String provincia;
    private final double temMax;
    private final LocalTime horaTemMax;
    private final double temMin;
    private final LocalTime horaTemMin;
    private final double precipitacion;

    public Tiempo(String localidad, String provincia, double temMax, LocalTime horaTemMax,
                  double temMin, LocalTime horaTemMin, double precipitacion) {
        this.localidad = localidad;
        this.provincia = provincia;
        this.temMax = temMax;
        this.horaTemMax = horaTemMax;
        this.temMin = temMin;
        this.horaTemMin = horaTemMin;
        this.precipitacion = precipitacion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public double getTemMax() {
        return temMax;
    }

    public LocalTime getHoraTemMax() {
        return horaTemMax;
    }

    public double getTemMin() {
        return temMin;
    }

    public LocalTime getHoraTemMin() {
        return horaTemMin;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

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



