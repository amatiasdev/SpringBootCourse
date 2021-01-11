package com.aldomatias;
       
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class ControladorGET001 {
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio( Model model){ 
        var mensaje = "Adios Mundo como Tymeleaf";
        
        var persona = new Persona();
        persona.setNombre("ALDO");
        persona.setApellido("Matias");
        persona.setEmail("aldo@matias.com");
        persona.setTelefono("34567890");
        
        var persona2 = new Persona();
        persona2.setNombre("RAFAEL");
        persona2.setApellido("ORTIZ");
        persona2.setEmail("rafael@ortiz.com");
        persona2.setTelefono("34567543");
    
//        var personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona2);

        var personas = Arrays.asList(persona, persona2);
        
        log.info("EJECUTANTO CONTROLADOR SPRING MVsC");
        model.addAttribute("mensaje", mensaje );
        model.addAttribute("saludo", saludo);
        model.addAttribute("personas", personas);
        return "index";
    }
}