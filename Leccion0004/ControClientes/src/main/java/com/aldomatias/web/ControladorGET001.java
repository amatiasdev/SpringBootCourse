package com.aldomatias.web;
       
import com.aldomatias.dao.PersonaDao;
import com.aldomatias.servicio.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class ControladorGET001 {
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio( Model model){   
        
        var personas = personaService.listarPersonas();
        log.info("EJECUTANTO CONTROLADOR SPRING MVsC"); 
        model.addAttribute("personas", personas);
        return "index";
    }
}