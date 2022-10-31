package com.foraneo.BecerraVCard.models.service;

import org.springframework.stereotype.Component;

@Component
public class MiServicio implements IService{

    @Override
    public String ServiceV (){
        return "VCard";
    }
}
