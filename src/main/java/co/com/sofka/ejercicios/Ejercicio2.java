package co.com.sofka.ejercicios;

import co.com.sofka.util.MalasParabras;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void chat(){
        boolean index = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escribe la frase que desea que analizar: ");
            String palabra = scanner.nextLine();
            List<String> siguientepalabra = Arrays.stream(palabra.split(" ")).toList();
            Flux.fromIterable(siguientepalabra)
                    .map(e-> {
                    if (MalasParabras.malaspalabras.contains(e.toLowerCase())){
                        e = "*****";
                    }
                    return e;
                    }).reduce("", (a,b)-> a += " "+ b)
                    .subscribe(e-> System.out.println("La frase modificada es: " + e));
            }
    }
