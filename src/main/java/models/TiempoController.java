package models;

import lombok.val;

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TiempoController {

    private void csvReader(){

        List<String> archivosCsv = new ArrayList<>();
        archivosCsv.add(System.getProperty("user.dir") + "/data/Aemet20171029.csv");
        archivosCsv.add(System.getProperty("user.dir") + "/data/Aemet20171030.csv");
        archivosCsv.add(System.getProperty("user.dir") + "/data/Aemet20171031.csv");

        for (String archivo : archivosCsv ) {
            try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
                Stream<Tiempo> mediciones = lector.lines()
                        .map(linea -> linea.split(","))
                        .map(valores -> Tiempo.builder()
                                .localidad(valores[0])
                                .provincia(valores[1])
                                .temMax(Double.parseDouble(valores[3]))
                                .horaTemMax(LocalTime.parse(valores[4]))
                                .temMin(Double.parseDouble(valores[5]))
                                .horaTemMin(LocalTime.parse(valores[6]))
                                .precipitacion(Double.parseDouble(valores[7]))
                                .build()
                        );
                @val
                List<Tiempo> tiempoList = mediciones.toList();



            }catch(IOException e){
                System.err.println("Error en lectura de archivo:" + archivo + e.getMessage());
            }

        }

    }


}
