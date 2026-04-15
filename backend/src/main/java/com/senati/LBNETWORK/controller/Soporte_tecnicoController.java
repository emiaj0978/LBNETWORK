package com.senati.LBNETWORK.controller;

import com.senati.LBNETWORK.entity.Soporte_tecnico;
import com.senati.LBNETWORK.service.Soporte_tecnicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//3 ANOTACIONES
//Indica que esta clase maneja peticiones HTTPS y DEVUELVE JSON
@RestController
// Define la URL Base de todos los END-POINT de esta clase
@RequestMapping("api/soporte_tecnicos")
// Esta anotacion permite que el front-end pueda llamar a esta API
// Si no ponemos esto, el navegador bloquea las peticiones por politicas CORS
@CrossOrigin(origins = "*")
public class Soporte_tecnicoController {
    //DECLARAMOS UNA VARIABLE DEFINIDA
    // Inyectamos el servicio para acceder a la logica del negocio
    private final Soporte_tecnicoService soporte_tecnicoService;
    public Soporte_tecnicoController(Soporte_tecnicoService soporte_tecnicoService){
        this.soporte_tecnicoService = soporte_tecnicoService;
    }
    //GET /api/clientes -> devuelve todos los clientes en formato JSON
    @GetMapping
    public List<Soporte_tecnico> listar() {return soporte_tecnicoService.listarTodos();}

    //delete/api/clientes/{id} -> elimina un cliente por su id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable long id){

        soporte_tecnicoService.eliminarSoporte_tecnico(id);
        return ResponseEntity.noContent().build();

    }
}
