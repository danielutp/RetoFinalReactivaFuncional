package co.com.sofka;

import co.com.sofka.ejercicios.Ejercicio1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetoFinalReactivoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoFinalReactivoApplication.class, args);
		//Ejercicio1.eliminarRepetidos().forEach(System.out::println);
		//Ejercicio1.filtroCorreos().forEach(System.out::println);
		//Ejercicio1.filtrarCondiciones().forEach(System.out::println);
		//System.out.println(Ejercicio1.cantidadCorreos());
		System.out.println(Ejercicio1.cantidadCorreosGmailHotmailOutlook());


	}

}
