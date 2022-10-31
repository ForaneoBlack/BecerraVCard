package com.foraneo.BecerraVCard.models.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Usuario {

    @Value("${usuario.nombre}")
    private String nombre;
    @Value("${usuario.apellido}")
    private String apellido;
    @Autowired
    private Ciudad ciudad;
    @Autowired
    private Sucursal sucursal;

    public Usuario(String nombre, String apellido, Ciudad ciudad, Sucursal sucursal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.sucursal = sucursal;
    }

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
