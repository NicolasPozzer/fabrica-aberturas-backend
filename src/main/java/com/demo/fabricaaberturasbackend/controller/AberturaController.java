package com.demo.fabricaaberturasbackend.controller;

import com.demo.fabricaaberturasbackend.model.Abertura;
import com.demo.fabricaaberturasbackend.service.AberturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AberturaController {

    @Autowired
    private AberturaService abertuServ;

    /*End Points*/

    @GetMapping("/aberturas/traertodos")
    public List<Abertura> getAberturas(){
        return abertuServ.getAberturas();
    }

    @GetMapping("/aberturas/puertas")
    public List<Abertura> getPuertas(){
        return abertuServ.getPuertas();
    }

    @GetMapping("/aberturas/ventanas")
    public List<Abertura> getVentanas(){
        return abertuServ.getVentanas();
    }

    @PostMapping("/aberturas/crear")
    public String saveAbertura(@RequestBody Abertura abertura){
        abertuServ.saveAbertura(abertura);
        return "| Abertura Aniadida |";
    }

    @DeleteMapping("/aberturas/borrar/{id}")
    public String deleteAbertura(@PathVariable Long id){
        abertuServ.deleteAbertura(id);
        return "| Abertura Eliminada |";
    }

    @GetMapping("/aberturas/find/{id}")
    public Abertura findAbertura(@PathVariable Long id){
        return abertuServ.findAbertura(id);
    }

    @PutMapping("/aberturas/edit")
    public String editAbertura(@RequestBody Abertura abertura){
        abertuServ.editAbertura(abertura);
        return "| Abertura Editada |";
    }

}
