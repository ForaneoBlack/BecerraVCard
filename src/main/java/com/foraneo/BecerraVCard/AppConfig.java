package com.foraneo.BecerraVCard;

import com.foraneo.BecerraVCard.models.domain.Ciudad;
import com.foraneo.BecerraVCard.models.domain.Sucursal;
import com.foraneo.BecerraVCard.models.domain.Usuario;
import com.foraneo.BecerraVCard.models.service.IService;
import com.foraneo.BecerraVCard.models.service.MiServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("MiServicio")

    public IService regisrarMiServicio(){
        return new MiServicio();
    }





}
