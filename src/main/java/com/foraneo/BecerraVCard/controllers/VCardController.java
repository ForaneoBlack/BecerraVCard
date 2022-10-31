package com.foraneo.BecerraVCard.controllers;

import com.foraneo.BecerraVCard.models.domain.Ciudad;
import com.foraneo.BecerraVCard.models.domain.Sucursal;
import com.foraneo.BecerraVCard.models.domain.Usuario;
import com.foraneo.BecerraVCard.models.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VCardController {

@Autowired
private MiServicio servicio;

private Usuario usuario;


    @GetMapping("")
    public String VCardB(Model model){
    Usuario usuario1 = new Usuario("David","Becerra");
        Usuario usuario2 = new Usuario("Ricardo","Becerra");
        Usuario usuario3 = new Usuario("Ayrthon","Becerra");
        Ciudad ciudad1 = new Ciudad("1","Santa Rosa");
        Ciudad ciudad2 = new Ciudad("2","Huaquillas");
        Ciudad ciudad3 = new Ciudad("3","Machala");
        Sucursal sucursal1 = new Sucursal("1","Puerto Jeli");
        Sucursal sucursal2 = new Sucursal("2","Puerto Hualtaco");
        Sucursal sucursal3 = new Sucursal("3","Puerto Bolivar");

        model.addAttribute("objeto",servicio.ServiceV());
        model.addAttribute("usuario",usuario1);
        model.addAttribute("usuario2",usuario2);
        model.addAttribute("usuario3",usuario3);
        model.addAttribute("ciudad",ciudad1);
        model.addAttribute("ciudad2",ciudad2);
        model.addAttribute("ciudad3",ciudad3);
        model.addAttribute("sucursal",sucursal1);
        model.addAttribute("sucursal2",sucursal2);
        model.addAttribute("sucursal3",sucursal3);
        model.addAttribute("titulo", "VCard");
        return "index";
    }

@Autowired
    public VCardController(MiServicio servicio) {
        this.servicio = servicio;
    }

}
