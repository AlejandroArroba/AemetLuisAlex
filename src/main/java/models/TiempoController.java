package models;

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TiempoController {

    private void csvReader(String csv){
        String csvLocation = "C:\\DAW\\Desarrollo Web entorno Servidor\\Primer Trimestre\\Practicas\\AemetLuisAlex\\data\\Aemet20171029.csv";

        try(BufferedReader lector = new BufferedReader(new FileReader(csvLocation))){
            Stream<Tiempo> medicionesTiempo = lector.lines()
                    .map(linea -> linea.split(";"))
                    .map(valores -> new Tiempo(valores[0], valores[1],Double.parseDouble(valores[2]),
                            LocalTime.parse(valores[3]), Double.parseDouble(valores[4]),
                            LocalTime.parse(valores[6]), Double.parseDouble(valores[6])));

                    medicionesTiempo.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
