package co.com.sofka.ejercicios;

import co.com.sofka.models.Correo;
import co.com.sofka.util.ListaCorreos;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static List<Correo> eliminarRepetidos(){
        return  ListaCorreos.correos.stream()
                .distinct()
                .collect(Collectors.toList());
    }



}
