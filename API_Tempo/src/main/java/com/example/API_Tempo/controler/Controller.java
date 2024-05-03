package com.example.API_Tempo.controler;

import com.example.API_Tempo.service.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //Classe de serviços

    @Autowired
    private ClimaService service;

    @GetMapping("/clima")
    public String preverTempo(){
        return service.preverTempo();
    }
}