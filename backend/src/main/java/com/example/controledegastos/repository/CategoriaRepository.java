package com.example.controledegastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controledegastos.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}