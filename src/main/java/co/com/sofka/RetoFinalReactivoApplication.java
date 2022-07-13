package co.com.sofka;

import co.com.sofka.ejercicios.Ejercicio1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetoFinalReactivoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoFinalReactivoApplication.class, args);
		Ejercicio1.eliminarRepetidos().forEach(System.out::println);

	}

}
