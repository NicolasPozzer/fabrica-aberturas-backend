package com.demo.fabricaaberturasbackend.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Abertura {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String tipo;
    private String detalles;
    private String medidas;
    private Double precio;
    private String urlMiniatura;
    private String urlFoto;

    public Abertura() {
    }

    public Abertura(Long id, String nombre, String tipo, String detalles, String medidas, Double precio, String urlMiniatura, String urlFoto) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.detalles = detalles;
        this.medidas = medidas;
        this.precio = precio;
        this.urlMiniatura = urlMiniatura;
        this.urlFoto = urlFoto;
    }
}
