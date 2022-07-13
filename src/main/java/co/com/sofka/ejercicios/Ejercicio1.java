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

    public static List<Correo> filtroCorreos(){

        return ListaCorreos.correos.stream()
                .filter(correo -> correo.getCorreo().contains("@gmail.com")||correo.getCorreo().contains("@hotmail.com")||correo.getCorreo().contains("@outlook.com"))
                .collect(Collectors.toList());
    }

    public static List<Correo> filtrarCondiciones(){

        return ListaCorreos.correos.stream()
                .filter(correo -> correo.getCorreo().matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .map(correo -> new Correo(correo.getCorreo().toLowerCase(),correo.getEstadoEnviado()))
                .collect(Collectors.toList());
    }

    public static Integer cantidadCorreos(){
        return ListaCorreos.correos.stream()
                .filter(correo -> correo.getCorreo().matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .collect(Collectors.toList()).size();
    }

    public static void cantidadCorreosGmailHotmailOutlook(){
        System.out.println("Correos Gmail: " + ListaCorreos.correos.stream()
                .filter(correo -> correo.getCorreo().matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .filter(correo -> correo.getCorreo().contains("@gmail.com"))
                .collect(Collectors.toList()).size());

        System.out.println("Correos Hotmail: " + ListaCorreos.correos.stream()
                .filter(correo -> correo.getCorreo().matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .filter(correo -> correo.getCorreo().contains("@hotmail.com"))
                .collect(Collectors.toList()).size());

        System.out.println("Correos Outlook: " + ListaCorreos.correos.stream()
                .filter(correo -> correo.getCorreo().matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .filter(correo -> correo.getCorreo().contains("@outlook.com"))
                .collect(Collectors.toList()).size());
    }

    public static List<Correo> cambiarEstadoCorreo(){
        return ListaCorreos.correos.stream()
                .map(correo -> {
                   if (correo.getEstadoEnviado()==true) {
                       correo.setEstadoEnviado(false);
                       return correo;
                   } return correo;
                }).collect(Collectors.toList());
    }



}
