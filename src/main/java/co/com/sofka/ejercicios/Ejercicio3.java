package co.com.sofka.ejercicios;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejercicio3 {
    public void derivar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el coeficiente");
        var coeficiente = teclado.nextDouble();
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Escriba la potencia");
        var potencia = teclado2.nextDouble();

        BiFunction<Double, Double, Double> coeficienteResultado = (cop, pot)-> cop * pot;
        Function<Double, Double> expResultado = (pot) -> pot -1;

        System.out.println("Su derivada es : "+coeficienteResultado.apply(coeficiente,potencia)+"X^"+expResultado.apply(potencia));

    }


    public void integral() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el coeficiente");
        var base = teclado.nextDouble();
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Escriba la potencia");
        var potencia = teclado2.nextDouble();

        BiFunction<Double, Double, Double> coeficienteExponente = (cop, pot)-> cop / (pot + 1);
        Function<Double, Double> expResultado = (pot) -> pot + 1;

        System.out.println("Su integral es : "+coeficienteExponente.apply(base,potencia)+"X^"+expResultado.apply(potencia)+"+ C");

    }
}
