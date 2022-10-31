package com.foraneo.BecerraVCard.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Ciudad {
    @Value("{ciudad.cod_ciudad}")
    private String cod_ciudad;
    @Value("{ciudad.nombre}")
    private String nombre;

    public Ciudad(String cod_ciudad, String nombre) {
        this.cod_ciudad = cod_ciudad;
        this.nombre = nombre;
    }

    public String getCod_ciudad() {
        return cod_ciudad;
    }

    public void setCod_ciudad(String cod_ciudad) {
        this.cod_ciudad = cod_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
