package com.kripxon.kripxonapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kripxon.kripxonapp.model.RegistroAsistencia;

public interface AsistenciaRepository extends JpaRepository<RegistroAsistencia, Long> {
}