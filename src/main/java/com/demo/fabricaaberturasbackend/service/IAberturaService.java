package com.demo.fabricaaberturasbackend.service;

import com.demo.fabricaaberturasbackend.model.Abertura;
import org.aspectj.weaver.Lint;

import java.util.List;

public interface IAberturaService {

    /*Lista de todas las Aberturas*/
    public List<Abertura> getAberturas();

    /*Lista de Puertas*/
    public List<Abertura> getPuertas();

    /*Lista de Ventanas*/
    public List<Abertura> getVentanas();

    /*Crear/Agregar*/
    public void saveAbertura(Abertura abertura);

    /*Borrar*/
    public void deleteAbertura(Long id);

    /*Find*/
    public Abertura findAbertura(Long id);

    /*Editar*/
    public void editAbertura(Abertura abertura);


}
