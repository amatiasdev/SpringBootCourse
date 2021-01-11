package com.aldomatias.web;
       
import com.aldomatias.dao.PersonaDao;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class ControladorGET001 {
    @Autowired
    private PersonaDao personaDao;
    
    @GetMapping("/")
    public String inicio( Model model){   
        
        var personas = personaDao.findAll();
        log.info("EJECUTANTO CONTROLADOR SPRING MVsC"); 
        model.addAttribute("personas", personas);
        return "index";
    }
}