package com.demo.fabricaaberturasbackend.service;

import com.demo.fabricaaberturasbackend.model.Abertura;
import com.demo.fabricaaberturasbackend.repository.IAberturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AberturaService implements IAberturaService{

    /*Inyeccion de Dependencia
    * */
    @Autowired
    private IAberturaRepository repoAbertura;


    @Override
    public List<Abertura> getAberturas() {
        List<Abertura> listaAberturas = repoAbertura.findAll();
        return listaAberturas;
    }

    @Override
    public List<Abertura> getPuertas() {
        String palabra = "Puerta";
        List<Abertura> lista = getAberturas();
        List<Abertura> listaPuertas = new ArrayList<>();

        for (Abertura abertura : lista){
            if (palabra.equals(abertura.getTipo())){
                listaPuertas.add(abertura);
            }
        }
        return listaPuertas;
    }

    @Override
    public List<Abertura> getVentanas() {
        String palabra = "Ventana";
        List<Abertura> lista = getAberturas();
        List<Abertura> listaVentanas = new ArrayList<>();

        for(Abertura abertura : lista){
            if (palabra.equals(abertura.getTipo())){
                listaVentanas.add(abertura);
            }
        }
        return listaVentanas;
    }

    @Override
    public void saveAbertura(Abertura abertura) {
        repoAbertura.save(abertura);
    }

    @Override
    public void deleteAbertura(Long id) {
        repoAbertura.deleteById(id);
    }

    @Override
    public Abertura findAbertura(Long id) {
        Abertura abertura = repoAbertura.findById(id).orElse(null);

        return abertura;
    }

    @Override
    public void editAbertura(Abertura abertura) {
        this.saveAbertura(abertura);
    }
}
