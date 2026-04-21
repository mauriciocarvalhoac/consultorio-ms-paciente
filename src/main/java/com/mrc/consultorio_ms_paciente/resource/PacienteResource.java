package com.mrc.consultorio_ms_paciente.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteResource {

    @GetMapping
    public String teste() {
        return "Teste de CI/CD";
    }

}
