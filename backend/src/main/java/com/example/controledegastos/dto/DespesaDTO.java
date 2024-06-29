package com.example.controledegastos.dto;

import java.time.LocalDate;

import com.example.controledegastos.model.Categoria;

public class DespesaDTO {
    private String descricao;
    private double valor;
    private LocalDate data;
    private Categoria categoria;

    // Constructor
    public DespesaDTO() {
    }

    public DespesaDTO(String descricao, double valor, LocalDate data, Categoria categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    // Getters e Setters

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
