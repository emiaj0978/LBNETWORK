package com.senati.LBNETWORK.repository;

// IMPORTAMOS LOS DRIVERS, METODOS
import com.senati.LBNETWORK.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Anotacion @repository INTERFAZ COMO LA CAPA DE ACCESO A LA BASE DE DATOS
@Repository

public interface ServicioRepository extends JpaRepository<Servicio, Long> {
    //No necesitamos escribir nada aqui
    // JpaRepository ya tiene_todo_lo_basico

}

