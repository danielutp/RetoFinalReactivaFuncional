package co.com.sofka.models;

import lombok.Data;

@Data
public class Correo {
    private String Correo;
    private Boolean estadoEnviado;

    public Correo(String correo, Boolean estadoEnviado) {
        Correo = correo;
        this.estadoEnviado = estadoEnviado;
    }


}
