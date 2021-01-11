package com.aldomatias;
       
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ControladorGET001 {
    
    @GetMapping("/")
    public String inicio(){
        log.info("EJECUTANTO CONTROLADOR"); 
        return "Hola Mundo Spring boot";
    }
    
    @GetMapping("/test")
    public String start(){
        log.info("EJECUTANTO CONTROLADOR"); 
        return "Hola Mundo";
    }
}