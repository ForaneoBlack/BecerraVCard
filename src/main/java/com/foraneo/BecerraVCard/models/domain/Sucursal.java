package com.foraneo.BecerraVCard.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Sucursal {

    @Autowired
    private Ciudad ciudad;
    @Value("{sucursal.cod}")
    private String cod;
    @Value("{sucursal.nombre}")
    private String nombre;

    public Sucursal(Ciudad ciudad, String cod, String nombre) {
        this.ciudad = ciudad;
        this.cod = cod;
        this.nombre = nombre;
    }

    public Sucursal(String cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
