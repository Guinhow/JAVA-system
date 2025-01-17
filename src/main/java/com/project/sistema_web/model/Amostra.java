package com.project.sistema_web.model;

import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
@Table(name = "amostras")
public class Amostra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer codigoBq;
    private LocalDate dataColeta;
    private LocalDate dataEntrada;
    private String cliente;
    private Integer codigoAmostra;
    private String sample;
    private Double peso;
    private Double temperatura;
    private String obs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getCodigoAmostra() {
        return codigoAmostra;
    }

    public void setCodigoAmostra(Integer codigoAmostra) {
        this.codigoAmostra = codigoAmostra;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getCodigoBq() {
        return codigoBq;
    }

    public void setCodigoBq(Integer codigoBq) {
        this.codigoBq = codigoBq;
    }

    public LocalDate getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(LocalDate dataColeta) {
        this.dataColeta = dataColeta;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}